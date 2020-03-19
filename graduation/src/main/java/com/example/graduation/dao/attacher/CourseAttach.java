package com.example.graduation.dao.attacher;

import com.example.graduation.entity.course.CourseEntity;
import com.example.graduation.entity.course.GraduationPointCourseEvaResultEntity;
import com.example.graduation.entity.course.GraduationPointEntity;
import com.example.graduation.entity.VO.course.CourseEntityVO;
import com.example.graduation.entity.VO.course.GraduationPointCourseEntityVO;
import com.example.graduation.entity.VO.course.GraduationPointCourseEvaResultEntityVO;
import com.example.graduation.entity.VO.course.GraduationPointEntityVO;
import com.example.graduation.service.BaseService;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CourseAttach extends BaseService {


    public GraduationPointCourseAttach getGraduationPointCourseAttach(List<GraduationPointCourseEntityVO> pointCourseEntities) {
        return new GraduationPointCourseAttach(pointCourseEntities);
    }

    public class GraduationPointCourseAttach{

        private List<GraduationPointCourseEntityVO> pointCourseEntities;

        public GraduationPointCourseAttach(List<GraduationPointCourseEntityVO> pointCourseEntities){
            this.pointCourseEntities = pointCourseEntities;
        }


        public GraduationPointCourseAttach attachCourse(){
            for(GraduationPointCourseEntityVO entityVO:pointCourseEntities){
                CourseEntity courseEntity = courseDao.getById(entityVO.getCourseId());
                entityVO.setCourseEntity(new CourseEntityVO(courseEntity));
            }
            return this;
        }

        public GraduationPointCourseAttach attachGraPoint(){
            for(GraduationPointCourseEntityVO entityVO:pointCourseEntities){
                GraduationPointEntity pointEntity = graduationPointDao.getById(entityVO.getPointId());
                entityVO.setPointEntity(new GraduationPointEntityVO(pointEntity));
            }
            return this;
        }

        public GraduationPointCourseAttach attachGraPointCourseEva(){
            for(GraduationPointCourseEntityVO entityVO:pointCourseEntities){
                List<GraduationPointCourseEvaResultEntity> resultEntities = graduationPointCourseEvaResultDao.getByPointCourseIds(new ArrayList<>(entityVO.getId()));
                List<GraduationPointCourseEvaResultEntityVO> resultEntityVOS = resultEntities.stream()
                        .map(graduationPointCourseEvaResultEntity -> new GraduationPointCourseEvaResultEntityVO(graduationPointCourseEvaResultEntity))
                        .collect(Collectors.toList());
                entityVO.setResultEntities(resultEntityVOS);
            }
            return this;
        }

    }
}
