package com.example.graduation.request.course;

import com.example.graduation.request.BaseRequest;

public class GraPointCourseListRequest extends BaseRequest {

    private Integer courseId;
    private Integer pointId;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Integer getPointId() {
        return pointId;
    }

    public void setPointId(int pointId) {
        this.pointId = pointId;
    }

}
