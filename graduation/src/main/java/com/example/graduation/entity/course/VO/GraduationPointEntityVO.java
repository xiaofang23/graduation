package com.example.graduation.entity.course.VO;

import com.example.graduation.entity.course.GraduationPointEntity;
import com.example.graduation.entity.course.GraduationPointEvaResultEntity;
import org.springframework.beans.BeanUtils;

import java.sql.Timestamp;
import java.util.List;

public class GraduationPointEntityVO {

    private int id;
    private Integer targetId;
    private String description;
    private Integer status;
    private Timestamp createTime;
    private Timestamp updateTime;

    private List<GraduationPointCourseEntityVO> pointCourseEntities;
    private GraduationPointEvaResultEntityVO pointEvaResultEntity;

    public GraduationPointEntityVO(GraduationPointEntity pointEntity){
        BeanUtils.copyProperties(pointEntity,this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<GraduationPointCourseEntityVO> getPointCourseEntities() {
        return pointCourseEntities;
    }

    public void setPointCourseEntities(List<GraduationPointCourseEntityVO> pointCourseEntities) {
        this.pointCourseEntities = pointCourseEntities;
    }

    public GraduationPointEvaResultEntityVO getPointEvaResultEntity() {
        return pointEvaResultEntity;
    }

    public void setPointEvaResultEntity(GraduationPointEvaResultEntityVO pointEvaResultEntity) {
        this.pointEvaResultEntity = pointEvaResultEntity;
    }
}
