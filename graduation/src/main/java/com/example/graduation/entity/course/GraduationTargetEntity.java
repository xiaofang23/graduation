package com.example.graduation.entity.course;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "graduation_target", schema = "bishe")
public class GraduationTargetEntity {
    private int id;
    private String description;
    private String evaluationMethod;
    private String evaluationCycle;
    private String responsible;
    private String evaluationBasis;
    private String assessmentMethod;
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
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "evaluation_method")
    public String getEvaluationMethod() {
        return evaluationMethod;
    }

    public void setEvaluationMethod(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    @Basic
    @Column(name = "evaluation_cycle")
    public String getEvaluationCycle() {
        return evaluationCycle;
    }

    public void setEvaluationCycle(String evaluationCycle) {
        this.evaluationCycle = evaluationCycle;
    }

    @Basic
    @Column(name = "responsible")
    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    @Basic
    @Column(name = "evaluation_basis")
    public String getEvaluationBasis() {
        return evaluationBasis;
    }

    public void setEvaluationBasis(String evaluationBasis) {
        this.evaluationBasis = evaluationBasis;
    }

    @Basic
    @Column(name = "assessment_method")
    public String getAssessmentMethod() {
        return assessmentMethod;
    }

    public void setAssessmentMethod(String assessmentMethod) {
        this.assessmentMethod = assessmentMethod;
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
        GraduationTargetEntity that = (GraduationTargetEntity) o;
        return id == that.id &&
                Objects.equals(description, that.description) &&
                Objects.equals(evaluationMethod, that.evaluationMethod) &&
                Objects.equals(evaluationCycle, that.evaluationCycle) &&
                Objects.equals(responsible, that.responsible) &&
                Objects.equals(evaluationBasis, that.evaluationBasis) &&
                Objects.equals(assessmentMethod, that.assessmentMethod) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, evaluationMethod, evaluationCycle, responsible, evaluationBasis, assessmentMethod, status, createTime, updateTime);
    }
}
