package com.example.graduation.service;

import com.alibaba.fastjson.JSON;
import com.example.graduation.dao.attacher.CourseAttach;
import com.example.graduation.entity.course.*;
import com.example.graduation.entity.course.VO.*;
import com.example.graduation.exception.IllegalInputException;
import com.example.graduation.request.BaseRequest;
import com.example.graduation.request.course.CourseEvaRequest;
import com.example.graduation.request.course.CourseSaveRequest;
import com.example.graduation.request.course.CourseUpdateRequest;
import com.example.graduation.request.course.requestEntity.EvaItem;
import com.example.graduation.request.course.requestEntity.GraPointCourseListRequest;
import com.example.graduation.response.BaseResponse;
import com.example.graduation.response.course.CourseListResponse;
import com.example.graduation.response.course.CourseModuleListResponse;
import com.example.graduation.response.course.CourseStructureListResponse;
import com.example.graduation.response.course.GraPointCourseListResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseService extends BaseService{


    @Autowired
    private CourseAttach courseAttach;

    @Transactional(readOnly = true)
    public CourseListResponse getCourseList(BaseRequest request) {
        CourseListResponse response = new CourseListResponse();
        List<CourseEntity> courseEntities = courseDao.getCourseList(request);
        List<CourseEntityVO> entityVOList = courseEntities.stream()
                .map(courseEntity -> new CourseEntityVO(courseEntity))
                .collect(Collectors.toList());
        response.setCourseEntityVOS(entityVOList);
        response.setCount(courseDao.getCourseCount());
        return response;
    }

    @Transactional
    public BaseResponse saveCourse(CourseSaveRequest courseSaveRequest) {
        CourseEntity courseEntity = new CourseEntity();
        BeanUtils.copyProperties(courseSaveRequest,courseEntity);
        courseDao.save(courseEntity);
        return new BaseResponse();
    }

    @Transactional
    public BaseResponse updateCourse(CourseUpdateRequest courseUpdateRequest) {
        CourseEntity courseEntity = courseDao.getById(courseUpdateRequest.getCourseEntityVO().getId());
        BeanUtils.copyProperties(courseUpdateRequest.getCourseEntityVO(),courseEntity);
        courseDao.save(courseEntity);
        return new BaseResponse();
    }

    @Transactional
    public BaseResponse deleteCourse(BaseRequest request) {
        CourseEntity courseEntity = courseDao.getById(request.getId());
        courseEntity.setStatus(CourseEntity.COURSE_INACTIVE);
        courseDao.save(courseEntity);
        return new BaseResponse();
    }

    @Transactional(readOnly = true)
    public CourseStructureListResponse getStructureList(BaseRequest request) {
        List<CourseStructureEntity> courseStructureEntities = courseStructureDao.getCourseStructureList(request);
        List<CourseStructureEntityVO> courseStructureEntityVOS = courseStructureEntities.stream()
                .map(courseStructureEntity -> new CourseStructureEntityVO(courseStructureEntity))
                .collect(Collectors.toList());
        List<CourseModuleEntityVO> moduleEntityVOS = getModules();
        for(CourseStructureEntityVO entityVO:courseStructureEntityVOS){
            entityVO.setCourseModuleEntityVOList(moduleEntityVOS);
        }
        CourseStructureListResponse response = new CourseStructureListResponse();
        response.setCount(courseStructureEntities.size());
        response.setStructureEntityVOList(courseStructureEntityVOS);
        return response;
    }

    private List<CourseModuleEntityVO> getModules(){
        List<CourseModuleEntity> moduleEntities = courseModuleDao.getByStructureId();
        List<CourseModuleEntityVO> moduleEntityVOS = moduleEntities.stream()
                .map(courseModuleEntity -> new CourseModuleEntityVO(courseModuleEntity))
                .collect(Collectors.toList());
        for(CourseModuleEntityVO entityVO:moduleEntityVOS){
            List<CourseCategoryEntityVO> categoryEntityVOS = getCategoriesByModuleId(entityVO.getId());
            entityVO.setCategoryEntityVOList(categoryEntityVOS);
        }
        return moduleEntityVOS;
    }

    private List<CourseCategoryEntityVO> getCategoriesByModuleId(int moduleId) {
        List<CourseCategoryEntity> categoryEntities = courseCategoryDao.getByModuleIds(moduleId);
        List<CourseCategoryEntityVO> categoryEntityVOS = categoryEntities.stream()
                .map(courseCategoryEntity -> new CourseCategoryEntityVO(courseCategoryEntity))
                .collect(Collectors.toList());
        for(CourseCategoryEntityVO entityVO:categoryEntityVOS){
            List<CourseGroupEntityVO> groupEntityVOs = getGroupsByCategoryId(entityVO.getId());
            entityVO.setCourseGroupEntityVOList(groupEntityVOs);
        }
        return categoryEntityVOS;
    }

    private List<CourseGroupEntityVO> getGroupsByCategoryId(int categoryId) {
        List<CourseGroupEntity> groupEntities = courseGroupDao.getByCategoryId(categoryId);
        List<CourseGroupEntityVO> groupEntityVOS = groupEntities.stream()
                .map(courseGroupEntity -> new CourseGroupEntityVO(courseGroupEntity))
                .collect(Collectors.toList());
        for(CourseGroupEntityVO entityVO:groupEntityVOS){
            List<CourseEntityVO> courseEntityVOS = getByGroupId(entityVO.getId());
            entityVO.setCourseEntityVOList(courseEntityVOS);
        }
        return groupEntityVOS;
    }

    private List<CourseEntityVO> getByGroupId(int groupId) {
        List<CourseEntity> courseEntities = courseDao.getByGroupId(groupId);
        List<CourseEntityVO> courseEntityVOS = courseEntities.stream()
                .map(courseEntity -> new CourseEntityVO(courseEntity))
                .collect(Collectors.toList());
        return courseEntityVOS;
    }

    @Transactional(readOnly = true)
    public CourseModuleListResponse getModuleList(BaseRequest request) {
        CourseModuleListResponse response = new CourseModuleListResponse();
        List<CourseModuleEntityVO> moduleEntityVOS = getModules();
        response.setCount(moduleEntityVOS.size());
        response.setModuleEntityVOList(moduleEntityVOS);
        return response;
    }

    @Transactional
    public BaseResponse evaCourse(CourseEvaRequest request) {
        courseValidation.validateCourseCanBeEva(request.getCourseId(),request.getStudent_level());
        validateCourseEvaItems(request.getEvaItemList());

        CourseEvaResultEntity resultEntity = new CourseEvaResultEntity();
        resultEntity.setCourseId(request.getCourseId());
        resultEntity.setStudentLevel(request.getStudent_level());
        resultEntity.setScore(getCourseEvaResult(request.getEvaItemList()));
        resultEntity.setEavCalJson(JSON.toJSONString(request.getEvaItemList()));
        resultEntity.setEvaTime(new Timestamp(System.currentTimeMillis()));
        resultEntity.setStatus(CourseEvaResultEntity.STATUS_ACTIVE);

        courseEvaResultDao.save(resultEntity);
        return  new BaseResponse();
    }

    private float getCourseEvaResult(List<EvaItem> evaItemList) {
        float result = 0;
        for(EvaItem item:evaItemList){
            result = result + item.getProportion()*item.getStudentAvgScore();
        }
        return Math.round(result)/100;
    }

    //是否为数字交给前端验证
    private void validateCourseEvaItems(List<EvaItem> evaItemList) {
        int proportion = 0;
        for(EvaItem evaItem:evaItemList){
            proportion += evaItem.getProportion();
        }
        if(proportion != 100)
        try {
            throw new IllegalInputException("输入总比例不为100");
        } catch (IllegalInputException e) {
            e.printStackTrace();
        }
    }

    @Transactional(readOnly = true)
    public GraPointCourseListResponse getGraPointCourseList(GraPointCourseListRequest request) {
        GraPointCourseListResponse response = new GraPointCourseListResponse();
        List<GraduationPointCourseEntity> pointCourseEntities =
                graduationPointCourseDao.getByCourseIdAndPointIdAndStuLevel(request.getCourseId(),request.getPointId());
        List<GraduationPointCourseEntityVO> pointCourseEntityVOS = pointCourseEntities.stream()
                .map(graduationPointCourseEntity -> new GraduationPointCourseEntityVO(graduationPointCourseEntity))
                .collect(Collectors.toList());
        courseAttach.getGraduationPointCourseAttach(pointCourseEntityVOS)
                .attachCourse()
                .attachGraPoint()
                .attachGraPointCourseEva();
        response.setCount(pointCourseEntityVOS.size());
        response.setPointCourseEntities(pointCourseEntityVOS);
        return response;
    }
}
