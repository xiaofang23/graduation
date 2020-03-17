package com.example.graduation.validator;

import com.example.graduation.entity.course.CourseEntity;
import com.example.graduation.entity.course.CourseEvaResultEntity;
import com.example.graduation.entity.course.GraduationPointCourseEvaResultEntity;
import com.example.graduation.entity.course.GraduationPointEvaResultEntity;
import com.example.graduation.entity.user.AdminEntity;
import com.example.graduation.entity.user.TeacherEntity;
import com.example.graduation.exception.IllegalInputException;
import com.example.graduation.request.course.CourseTeacherSaveRequest;
import com.example.graduation.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CourseValidation extends BaseService {

    public void validateCourseCanBeEva(int courseId,int student_level){
        CourseEvaResultEntity resultEntity = courseEvaResultDao.getByCourseIDAndStuLevel(courseId,student_level);
        if(null != resultEntity)
            try {
                throw new IllegalInputException("该级这门学科已被评估");
            } catch (IllegalInputException e) {}
    }

    public void validatePointCourseCanBeEva(int pointCourseId, int student_level) {
        GraduationPointCourseEvaResultEntity resultEntity =
                graduationPointCourseEvaResultDao.getByPointCourseIdAndStuLevel(pointCourseId,student_level);
        if(null != resultEntity)
            try {
                throw new IllegalInputException("该级这门学科已被评估");
            } catch (IllegalInputException e) {}
    }

    public void validatePointCanBeEva(int pointId, int stuLevel) {
        GraduationPointEvaResultEntity resultEntity =
                graduationPointEvaResultDao.getByPointIdAndStuLevel(pointId,stuLevel);
        if(null != resultEntity)
            try {
                throw new IllegalInputException("该级该指标点已被评估");
            } catch (IllegalInputException e) {}
    }

    public void validateCourseTeacherCanBeSave(CourseTeacherSaveRequest request) {
        CourseEntity courseEntity = courseDao.getById(request.getCourseId());
        TeacherEntity teacherEntity = teacherDao.getById(request.getTeacherId());

        try {
            if(null == courseEntity || null == teacherEntity){
                throw new IllegalInputException("课程或者老师不存在");
            }else if(courseEntity.getStatus() == CourseEntity.COURSE_ACTIVE
            && teacherEntity.getStatus() == AdminEntity.USER_STATUS_ACTIVE){
                return;
            }else {
                throw new IllegalInputException("课程或者老师状态错误");
            }
        } catch (IllegalInputException e) {
            e.printStackTrace();
        }

    }
}
