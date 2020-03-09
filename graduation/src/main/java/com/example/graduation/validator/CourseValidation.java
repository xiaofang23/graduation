package com.example.graduation.validator;

import com.example.graduation.dao.course.CourseEvaResultDao;
import com.example.graduation.entity.course.CourseEvaResultEntity;
import com.example.graduation.exception.IllegalInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseValidation {

    @Autowired
    private CourseEvaResultDao courseEvaResultDao;

    public void validateCourseCanBeEva(int courseId,int student_level){
        CourseEvaResultEntity resultEntity = courseEvaResultDao.getByCourseIDAndStuLevel(courseId,student_level);
        if(null != resultEntity)
            try {
                throw new IllegalInputException("该级这门学科已被评估");
            } catch (IllegalInputException e) {}
    }

}
