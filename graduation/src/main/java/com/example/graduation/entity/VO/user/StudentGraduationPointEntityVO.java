package com.example.graduation.entity.VO.user;

import com.example.graduation.entity.course.StudentGraduationPointEntity;
import org.springframework.beans.BeanUtils;

import java.sql.Timestamp;

public class StudentGraduationPointEntityVO {

    private int id;
    private Integer studentId;
    private Integer pointId;
    private Integer status;
    private String courseJson;
    private Timestamp createTime;
    private Timestamp updateTime;

    public StudentGraduationPointEntityVO(StudentGraduationPointEntity studentGraduationPointEntity){
        BeanUtils.copyProperties(studentGraduationPointEntity,this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getPointId() {
        return pointId;
    }

    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCourseJson() {
        return courseJson;
    }

    public void setCourseJson(String courseJson) {
        this.courseJson = courseJson;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
