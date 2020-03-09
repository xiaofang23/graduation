package com.example.graduation.entity.course;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "course_eva_result", schema = "bishe")
public class CourseEvaResultEntity {

    public static final int STATUS_ACTIVE = 1;
    public static final int STATUS_INACTIVE = 0;

    private int id;
    private Integer courseId;
    private Float score;
    private Integer studentLevel;
    private Timestamp evaTime;
    private String eavCalJson;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer status;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "course_id")
    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "score")
    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    @Basic
    @Column(name = "student_level")
    public Integer getStudentLevel() {
        return studentLevel;
    }

    public void setStudentLevel(Integer studentLevel) {
        this.studentLevel = studentLevel;
    }

    @Basic
    @Column(name = "eva_time")
    public Timestamp getEvaTime() {
        return evaTime;
    }

    public void setEvaTime(Timestamp evaTime) {
        this.evaTime = evaTime;
    }

    @Basic
    @Column(name = "eav_cal_json")
    public String getEavCalJson() {
        return eavCalJson;
    }

    public void setEavCalJson(String eavCalJson) {
        this.eavCalJson = eavCalJson;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseEvaResultEntity that = (CourseEvaResultEntity) o;
        return id == that.id &&
                Objects.equals(courseId, that.courseId) &&
                Objects.equals(score, that.score) &&
                Objects.equals(studentLevel, that.studentLevel) &&
                Objects.equals(evaTime, that.evaTime) &&
                Objects.equals(eavCalJson, that.eavCalJson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, courseId, score, studentLevel, evaTime, eavCalJson, createTime, updateTime, status);
    }
}
