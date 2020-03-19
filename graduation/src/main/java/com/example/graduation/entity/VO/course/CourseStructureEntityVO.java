package com.example.graduation.entity.VO.course;

import com.example.graduation.entity.course.CourseStructureEntity;
import org.springframework.beans.BeanUtils;

import java.sql.Timestamp;
import java.util.List;

public class CourseStructureEntityVO {

    private int id;
    private String name;
    private int type;
    private int totalCredit;
    private int compulsoryCredit;
    private int electiveCredit;
    private int status;
    private Timestamp createTime;
    private Timestamp updateTime;

    private List<CourseModuleEntityVO> courseModuleEntityVOList;

    public CourseStructureEntityVO(CourseStructureEntity courseStructureEntity){
        BeanUtils.copyProperties(courseStructureEntity,this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    public int getCompulsoryCredit() {
        return compulsoryCredit;
    }

    public void setCompulsoryCredit(int compulsoryCredit) {
        this.compulsoryCredit = compulsoryCredit;
    }

    public int getElectiveCredit() {
        return electiveCredit;
    }

    public void setElectiveCredit(int electiveCredit) {
        this.electiveCredit = electiveCredit;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<CourseModuleEntityVO> getCourseModuleEntityVOList() {
        return courseModuleEntityVOList;
    }

    public void setCourseModuleEntityVOList(List<CourseModuleEntityVO> courseModuleEntityVOList) {
        this.courseModuleEntityVOList = courseModuleEntityVOList;
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
