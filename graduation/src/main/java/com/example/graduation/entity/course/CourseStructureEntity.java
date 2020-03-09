package com.example.graduation.entity.course;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "course_structure", schema = "bishe")
public class CourseStructureEntity {
    private int id;
    private String name;
    private int type;
    private int totalCredit;
    private int compulsoryCredit;
    private int electiveCredit;
    private int status;
    private Timestamp createTime;
    private Timestamp updateTime;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "total_credit")
    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    @Basic
    @Column(name = "compulsory_credit")
    public int getCompulsoryCredit() {
        return compulsoryCredit;
    }

    public void setCompulsoryCredit(int compulsoryCredit) {
        this.compulsoryCredit = compulsoryCredit;
    }

    @Basic
    @Column(name = "elective_credit")
    public int getElectiveCredit() {
        return electiveCredit;
    }

    public void setElectiveCredit(int electiveCredit) {
        this.electiveCredit = electiveCredit;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseStructureEntity that = (CourseStructureEntity) o;
        return id == that.id &&
                type == that.type &&
                totalCredit == that.totalCredit &&
                compulsoryCredit == that.compulsoryCredit &&
                electiveCredit == that.electiveCredit &&
                status == that.status &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, totalCredit, compulsoryCredit, electiveCredit, status);
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
}
