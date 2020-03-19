package com.example.graduation.entity.VO.course;

import com.example.graduation.entity.course.CourseCategoryEntity;
import org.springframework.beans.BeanUtils;

import java.sql.Timestamp;
import java.util.List;

public class CourseCategoryEntityVO {

    private int id;
    private String categoryName;
    private int status;
    private int moduleId;
    private Timestamp createTime;
    private Timestamp updateTime;

    private List<CourseGroupEntityVO> courseGroupEntityVOList;

    public CourseCategoryEntityVO(CourseCategoryEntity courseCategoryEntity){
        BeanUtils.copyProperties(courseCategoryEntity,this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public List<CourseGroupEntityVO> getCourseGroupEntityVOList() {
        return courseGroupEntityVOList;
    }

    public void setCourseGroupEntityVOList(List<CourseGroupEntityVO> courseGroupEntityVOList) {
        this.courseGroupEntityVOList = courseGroupEntityVOList;
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
