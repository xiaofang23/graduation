package com.example.graduation.entity.course;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "student_graduation_point", schema = "bishe")
public class StudentGraduationPointEntity {

    public static final int STUDENT_POINT_FINISHED = 1;
    public static final int STUDENT_POINT_UNFINISHED = 2;
    public static final int STUDENT_POINT_NOT_START = 0;
    public static final int STUDENT_POINT_DELETED = -1;

    private int id;
    private Integer studentId;
    private Integer pointId;
    private Integer status;
    private String courseJson;
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
    @Column(name = "student_id")
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "point_id")
    public Integer getPointId() {
        return pointId;
    }

    public void setPointId(Integer pointId) {
        this.pointId = pointId;
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
    @Column(name = "course_Json")
    public String getCourseJson() {
        return courseJson;
    }

    public void setCourseJson(String courseJson) {
        this.courseJson = courseJson;
    }

    @Basic
    @Column(name = "create_Time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_Time")
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
        StudentGraduationPointEntity that = (StudentGraduationPointEntity) o;
        return id == that.id &&
                Objects.equals(studentId, that.studentId) &&
                Objects.equals(pointId, that.pointId) &&
                Objects.equals(status, that.status) &&
                Objects.equals(courseJson, that.courseJson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, studentId, pointId, status, courseJson, createTime, updateTime);
    }
}
