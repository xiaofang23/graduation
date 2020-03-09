package com.example.graduation.entity.course.VO;

import com.example.graduation.entity.course.GraduationPointCourseEntity;
import org.springframework.beans.BeanUtils;

import java.sql.Timestamp;
import java.util.List;

public class GraduationPointCourseEntityVO {

    private int id;
    private Integer pointId;
    private Integer courseId;
    private Integer proportion;
    private Integer expectedScore;
    private Integer status;
    private Timestamp createTime;
    private Timestamp updateTime;

    private CourseEntityVO courseEntity;
    private GraduationPointEntityVO pointEntity;
    private List<GraduationPointCourseEvaResultEntityVO> resultEntities;


    public GraduationPointCourseEntityVO(GraduationPointCourseEntity courseEntity){
        BeanUtils.copyProperties(courseEntity,this);
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

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getProportion() {
        return proportion;
    }

    public void setProportion(Integer proportion) {
        this.proportion = proportion;
    }

    public Integer getExpectedScore() {
        return expectedScore;
    }

    public void setExpectedScore(Integer expectedScore) {
        this.expectedScore = expectedScore;
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

    public CourseEntityVO getCourseEntity() {
        return courseEntity;
    }

    public void setCourseEntity(CourseEntityVO courseEntity) {
        this.courseEntity = courseEntity;
    }

    public GraduationPointEntityVO getPointEntity() {
        return pointEntity;
    }

    public void setPointEntity(GraduationPointEntityVO pointEntity) {
        this.pointEntity = pointEntity;
    }

    public List<GraduationPointCourseEvaResultEntityVO> getResultEntities() {
        return resultEntities;
    }

    public void setResultEntities(List<GraduationPointCourseEvaResultEntityVO> resultEntities) {
        this.resultEntities = resultEntities;
    }
}
