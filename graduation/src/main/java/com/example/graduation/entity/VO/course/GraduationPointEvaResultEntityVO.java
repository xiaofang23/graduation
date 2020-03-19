package com.example.graduation.entity.VO.course;

import com.example.graduation.entity.course.GraduationPointEvaResultEntity;
import org.springframework.beans.BeanUtils;

import java.sql.Timestamp;

public class GraduationPointEvaResultEntityVO {

    private int id;
    private Integer pointId;
    private Float score;
    private Integer studentLevel;
    private Timestamp evaTime;
    private Integer status;
    private Timestamp createTime;
    private Timestamp updateTime;


    public GraduationPointEvaResultEntityVO(GraduationPointEvaResultEntity resultEntity){
        BeanUtils.copyProperties(resultEntity,this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getPointId() {
        return pointId;
    }

    public void setPointId(Integer pointId) {
        this.pointId = pointId;
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
}
