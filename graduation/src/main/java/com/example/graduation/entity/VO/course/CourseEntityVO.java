package com.example.graduation.entity.VO.course;

import com.example.graduation.entity.course.CourseEntity;
import org.springframework.beans.BeanUtils;

import java.sql.Timestamp;

public class CourseEntityVO {
    private int id;
    private Integer courseStructureId;
    private Integer courseModuleId;
    private Integer courseCategroyId;
    private Integer courseGroupId;
    private String courseNumber;
    private String courseName;
    private Double credit;
    private Boolean isCompulsory;
    private Boolean isElective;
    private Boolean isTheoretical;
    private Boolean isPractical;
    private String totalHour;
    private String theoreticalHour;
    private String practicalHour;
    private Boolean isTest;
    private Boolean isCheck;
    private String scoreMethod;
    private Integer preCourseId;
    private String suggestedSemester;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer expectedScore;

    public CourseEntityVO(CourseEntity courseEntity){
        BeanUtils.copyProperties(courseEntity,this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getCourseStructureId() {
        return courseStructureId;
    }

    public void setCourseStructureId(Integer courseStructureId) {
        this.courseStructureId = courseStructureId;
    }

    public Integer getCourseModuleId() {
        return courseModuleId;
    }

    public void setCourseModuleId(Integer courseModuleId) {
        this.courseModuleId = courseModuleId;
    }

    public Integer getCourseCategroyId() {
        return courseCategroyId;
    }

    public void setCourseCategroyId(Integer courseCategroyId) {
        this.courseCategroyId = courseCategroyId;
    }

    public Integer getCourseGroupId() {
        return courseGroupId;
    }

    public void setCourseGroupId(Integer courseGroupId) {
        this.courseGroupId = courseGroupId;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Boolean getCompulsory() {
        return isCompulsory;
    }

    public void setCompulsory(Boolean compulsory) {
        isCompulsory = compulsory;
    }

    public Boolean getElective() {
        return isElective;
    }

    public void setElective(Boolean elective) {
        isElective = elective;
    }

    public Boolean getTheoretical() {
        return isTheoretical;
    }

    public void setTheoretical(Boolean theoretical) {
        isTheoretical = theoretical;
    }

    public Boolean getPractical() {
        return isPractical;
    }

    public void setPractical(Boolean practical) {
        isPractical = practical;
    }

    public String getTotalHour() {
        return totalHour;
    }

    public void setTotalHour(String totalHour) {
        this.totalHour = totalHour;
    }

    public String getTheoreticalHour() {
        return theoreticalHour;
    }

    public void setTheoreticalHour(String theoreticalHour) {
        this.theoreticalHour = theoreticalHour;
    }

    public String getPracticalHour() {
        return practicalHour;
    }

    public void setPracticalHour(String practicalHour) {
        this.practicalHour = practicalHour;
    }

    public Boolean getTest() {
        return isTest;
    }

    public void setTest(Boolean test) {
        isTest = test;
    }

    public Boolean getCheck() {
        return isCheck;
    }

    public void setCheck(Boolean check) {
        isCheck = check;
    }

    public String getScoreMethod() {
        return scoreMethod;
    }

    public void setScoreMethod(String scoreMethod) {
        this.scoreMethod = scoreMethod;
    }

    public Integer getPreCourseId() {
        return preCourseId;
    }

    public void setPreCourseId(Integer preCourseId) {
        this.preCourseId = preCourseId;
    }

    public String getSuggestedSemester() {
        return suggestedSemester;
    }

    public void setSuggestedSemester(String suggestedSemester) {
        this.suggestedSemester = suggestedSemester;
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

    public Integer getExpectedScore() {
        return expectedScore;
    }

    public void setExpectedScore(Integer expectedScore) {
        this.expectedScore = expectedScore;
    }
}
