package com.example.graduation.request.course;

import com.example.graduation.entity.VO.course.CourseEntityVO;
import com.example.graduation.request.BaseRequest;

public class CourseUpdateRequest extends BaseRequest {

    private CourseEntityVO courseEntityVO;

    public CourseEntityVO getCourseEntityVO() {
        return courseEntityVO;
    }

    public void setCourseEntityVO(CourseEntityVO courseEntityVO) {
        this.courseEntityVO = courseEntityVO;
    }
}
