package com.example.graduation.request.course;

import com.example.graduation.request.course.requestEntity.EvaItem;

import javax.validation.constraints.NotNull;
import java.util.List;

public class GraPointCourseEvaRequest {

    @NotNull(message = "课程不饿能为空")
    private int pointCourseId;
    @NotNull(message = "学生级数不能为空")
    private int student_level;
    private List<EvaItem> evaItemList;

    public int getPointCourseId() {
        return pointCourseId;
    }

    public void setPointCourseId(int pointCourseId) {
        this.pointCourseId = pointCourseId;
    }

    public int getStudent_level() {
        return student_level;
    }

    public void setStudent_level(int student_level) {
        this.student_level = student_level;
    }

    public List<EvaItem> getEvaItemList() {
        return evaItemList;
    }

    public void setEvaItemList(List<EvaItem> evaItemList) {
        this.evaItemList = evaItemList;
    }
}
