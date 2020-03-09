package com.example.graduation.entity.course;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "graduation_point_course_eva_result", schema = "bishe")
public class GraduationPointCourseEvaResultEntity {

    public static final int POINT_COURSE_EVA_STATUS_ACTIVE = 1;
    public static final int POINT_COURSE_EVA_STATUS_INACTIVE = 0;

    private int id;
    private Integer pointCourseId;
    private Float score;
    private Integer studentLevel;
    private Timestamp evaTime;
    private String evaCalJson;
    private Integer status;
    private Timestamp createTime;
    private Timestamp updateTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "point_course_id")
    public Integer getPointCourseId() {
        return pointCourseId;
    }

    public void setPointCourseId(Integer pointCourseId) {
        this.pointCourseId = pointCourseId;
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
    @Column(name = "eva_cal_json")
    public String getEvaCalJson() {
        return evaCalJson;
    }

    public void setEvaCalJson(String evaCalJson) {
        this.evaCalJson = evaCalJson;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GraduationPointCourseEvaResultEntity that = (GraduationPointCourseEvaResultEntity) o;
        return id == that.id &&
                Objects.equals(pointCourseId, that.pointCourseId) &&
                Objects.equals(score, that.score) &&
                Objects.equals(studentLevel, that.studentLevel) &&
                Objects.equals(evaTime, that.evaTime) &&
                Objects.equals(evaCalJson, that.evaCalJson) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pointCourseId, score, studentLevel, evaTime, evaCalJson, status, createTime, updateTime);
    }
}
