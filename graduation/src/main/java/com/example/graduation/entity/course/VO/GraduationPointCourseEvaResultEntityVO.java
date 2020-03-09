package com.example.graduation.entity.course.VO;

import com.example.graduation.entity.course.GraduationPointCourseEvaResultEntity;
import org.springframework.beans.BeanUtils;

import java.sql.Timestamp;

public class GraduationPointCourseEvaResultEntityVO {

    private int id;
    private Integer pointCourseId;
    private Float score;
    private Integer studentLevel;
    private Timestamp evaTime;
    private String evaCalJson;
    private Integer status;
    private Timestamp createTime;
    private Timestamp updateTime;

    private GraduationPointCourseEntityVO pointCourseEntity;

    public GraduationPointCourseEvaResultEntityVO(GraduationPointCourseEvaResultEntity resultEntity){
        BeanUtils.copyProperties(resultEntity,this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getPointCourseId() {
        return pointCourseId;
    }

    public void setPointCourseId(Integer pointCourseId) {
        this.pointCourseId = pointCourseId;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Integer getStudentLevel() {
        return studentLevel;
    }

    public void setStudentLevel(Integer studentLevel) {
        this.studentLevel = studentLevel;
    }

    public Timestamp getEvaTime() {
        return evaTime;
    }

    public void setEvaTime(Timestamp evaTime) {
        this.evaTime = evaTime;
    }

    public String getEvaCalJson() {
        return evaCalJson;
    }

    public void setEvaCalJson(String evaCalJson) {
        this.evaCalJson = evaCalJson;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public GraduationPointCourseEntityVO getPointCourseEntity() {
        return pointCourseEntity;
    }

    public void setPointCourseEntity(GraduationPointCourseEntityVO pointCourseEntity) {
        this.pointCourseEntity = pointCourseEntity;
    }
}
