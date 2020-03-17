package com.example.graduation.request.course;

import com.example.graduation.request.BaseRequest;

public class CourseTeacherSaveRequest{

    private int courseId;
    private int teacherId;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
