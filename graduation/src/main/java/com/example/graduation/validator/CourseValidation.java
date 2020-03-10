package com.example.graduation.validator;

import com.example.graduation.entity.course.CourseEvaResultEntity;
import com.example.graduation.entity.course.GraduationPointCourseEvaResultEntity;
import com.example.graduation.entity.course.GraduationPointEvaResultEntity;
import com.example.graduation.exception.IllegalInputException;
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
}
