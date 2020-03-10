package com.example.graduation.request.course;

import javax.validation.constraints.NotNull;

public class GraPointEvaRequest {

    @NotNull(message = "课程不能为空")
    private int pointId;
    @NotNull(message = "学生级数不能为空")
    private int stuLevel;

    public int getPointId() {
        return pointId;
    }

    public void setPointId(int pointId) {
        this.pointId = pointId;
    }

    public int getStuLevel() {
        return stuLevel;
    }

    public void setStuLevel(int stuLevel) {
        this.stuLevel = stuLevel;
    }
}
