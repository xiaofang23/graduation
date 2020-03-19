package com.example.graduation.entity.VO.course;

import com.example.graduation.entity.course.CourseGroupEntity;
import org.springframework.beans.BeanUtils;

import java.sql.Timestamp;
import java.util.List;

public class CourseGroupEntityVO {

    private int id;
    private int moduleId;
    private int categoryId;
    private String groupName;
    private int status;
    private int structureId;
    private double theoryCompulsoryCredit;
    private double theoryElectiveCredit;
    private double practicalCompulsoryCredit;
    private double practicalElectiveCredit;
    private double totalCredit;
    private Timestamp createTime;
    private Timestamp updateTime;

    private List<CourseEntityVO> courseEntityVOList;

    public CourseGroupEntityVO(CourseGroupEntity courseGroupEntity){
        BeanUtils.copyProperties(courseGroupEntity,this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStructureId() {
        return structureId;
    }

    public void setStructureId(int structureId) {
        this.structureId = structureId;
    }

    public double getTheoryCompulsoryCredit() {
        return theoryCompulsoryCredit;
    }

    public void setTheoryCompulsoryCredit(double theoryCompulsoryCredit) {
        this.theoryCompulsoryCredit = theoryCompulsoryCredit;
    }

    public double getTheoryElectiveCredit() {
        return theoryElectiveCredit;
    }

    public void setTheoryElectiveCredit(double theoryElectiveCredit) {
        this.theoryElectiveCredit = theoryElectiveCredit;
    }

    public double getPracticalCompulsoryCredit() {
        return practicalCompulsoryCredit;
    }

    public void setPracticalCompulsoryCredit(double practicalCompulsoryCredit) {
        this.practicalCompulsoryCredit = practicalCompulsoryCredit;
    }

    public double getPracticalElectiveCredit() {
        return practicalElectiveCredit;
    }

    public void setPracticalElectiveCredit(double practicalElectiveCredit) {
        this.practicalElectiveCredit = practicalElectiveCredit;
    }

    public double getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(double totalCredit) {
        this.totalCredit = totalCredit;
    }

    public List<CourseEntityVO> getCourseEntityVOList() {
        return courseEntityVOList;
    }

    public void setCourseEntityVOList(List<CourseEntityVO> courseEntityVOList) {
        this.courseEntityVOList = courseEntityVOList;
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
