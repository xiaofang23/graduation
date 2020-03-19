package com.example.graduation.request.course;

import com.example.graduation.request.BaseRequest;
import com.example.graduation.request.course.requestEntity.GradeItem;

import java.util.List;

public class StudentCourseGradeSaveRequest extends BaseRequest {

    public static final int GRADE_TYPE_FIVE = 1;
    public static final int GRADE_TYPE_TWO = 2;
    public static final int GRADE_TYPE_HUNDRED = 3;

    private int courseId;
    private int teacherId;
    private int studentId;
    private int grade_type = GRADE_TYPE_FIVE;
    private String grade;

    private List<GradeItem> gradeItems;

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

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public List<GradeItem> getGradeItems() {
        return gradeItems;
    }

    public void setGradeItems(List<GradeItem> gradeItems) {
        this.gradeItems = gradeItems;
    }

    public int getGrade_type() {
        return grade_type;
    }

    public void setGrade_type(int grade_type) {
        this.grade_type = grade_type;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
