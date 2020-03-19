package com.example.graduation.entity.VO.course;

import com.example.graduation.entity.course.CourseModuleEntity;
import org.springframework.beans.BeanUtils;

import java.sql.Timestamp;
import java.util.List;

public class CourseModuleEntityVO {
    private int id;
    private String moduleName;
    private int status;
    private Timestamp createTime;
    private Timestamp updateTime;

    private List<CourseCategoryEntityVO> categoryEntityVOList;

    public CourseModuleEntityVO(CourseModuleEntity courseModuleEntity){
        BeanUtils.copyProperties(courseModuleEntity,this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<CourseCategoryEntityVO> getCategoryEntityVOList() {
        return categoryEntityVOList;
    }

    public void setCategoryEntityVOList(List<CourseCategoryEntityVO> categoryEntityVOList) {
        this.categoryEntityVOList = categoryEntityVOList;
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
