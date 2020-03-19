package com.example.graduation.response.course;

import com.example.graduation.entity.VO.course.CourseEntityVO;

import java.util.List;

public class CourseListResponse {

    private int count;
    private List<CourseEntityVO> courseEntityVOS;

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public List<CourseEntityVO> getCourseEntityVOS() {
        return courseEntityVOS;
    }

    public void setCourseEntityVOS(List<CourseEntityVO> courseEntityVOS) {
        this.courseEntityVOS = courseEntityVOS;
    }
}
