package com.example.graduation.entity.course;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "course_group", schema = "bishe")
public class CourseGroupEntity {
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
    @Column(name = "module_id")
    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    @Basic
    @Column(name = "category_id")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "group_name")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "structure_id")
    public int getStructureId() {
        return structureId;
    }

    public void setStructureId(int structureId) {
        this.structureId = structureId;
    }

    @Basic
    @Column(name = "theory_compulsory_credit")
    public double getTheoryCompulsoryCredit() {
        return theoryCompulsoryCredit;
    }

    public void setTheoryCompulsoryCredit(double theoryCompulsoryCredit) {
        this.theoryCompulsoryCredit = theoryCompulsoryCredit;
    }

    @Basic
    @Column(name = "theory_elective_credit")
    public double getTheoryElectiveCredit() {
        return theoryElectiveCredit;
    }

    public void setTheoryElectiveCredit(double theoryElectiveCredit) {
        this.theoryElectiveCredit = theoryElectiveCredit;
    }

    @Basic
    @Column(name = "practical_compulsory_credit")
    public double getPracticalCompulsoryCredit() {
        return practicalCompulsoryCredit;
    }

    public void setPracticalCompulsoryCredit(double practicalCompulsoryCredit) {
        this.practicalCompulsoryCredit = practicalCompulsoryCredit;
    }

    @Basic
    @Column(name = "practical_elective_credit")
    public double getPracticalElectiveCredit() {
        return practicalElectiveCredit;
    }

    public void setPracticalElectiveCredit(double practicalElectiveCredit) {
        this.practicalElectiveCredit = practicalElectiveCredit;
    }

    @Basic
    @Column(name = "total_credit")
    public double getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(double totalCredit) {
        this.totalCredit = totalCredit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseGroupEntity that = (CourseGroupEntity) o;
        return id == that.id &&
                moduleId == that.moduleId &&
                categoryId == that.categoryId &&
                status == that.status &&
                structureId == that.structureId &&
                Double.compare(that.theoryCompulsoryCredit, theoryCompulsoryCredit) == 0 &&
                Double.compare(that.theoryElectiveCredit, theoryElectiveCredit) == 0 &&
                Double.compare(that.practicalCompulsoryCredit, practicalCompulsoryCredit) == 0 &&
                Double.compare(that.practicalElectiveCredit, practicalElectiveCredit) == 0 &&
                Double.compare(that.totalCredit, totalCredit) == 0 &&
                Objects.equals(groupName, that.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, moduleId, categoryId, groupName, status, structureId, theoryCompulsoryCredit, theoryElectiveCredit, practicalCompulsoryCredit, practicalElectiveCredit, totalCredit);
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
