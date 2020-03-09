package com.example.graduation.response.course;

import com.example.graduation.entity.course.VO.GraduationPointCourseEntityVO;

import java.util.List;

public class GraPointCourseListResponse {

    private int count;
    private List<GraduationPointCourseEntityVO> pointCourseEntities;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<GraduationPointCourseEntityVO> getPointCourseEntities() {
        return pointCourseEntities;
    }

    public void setPointCourseEntities(List<GraduationPointCourseEntityVO> pointCourseEntities) {
        this.pointCourseEntities = pointCourseEntities;
    }
}
