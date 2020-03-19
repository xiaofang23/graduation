package com.example.graduation.entity.course;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "course", schema = "bishe")
public class CourseEntity {

    public static final int COURSE_INACTIVE = 0;
    public static final int COURSE_ACTIVE = 1;

    public static final int COURSE_SCORE_METHOD_FIVE = 1;
    public static final int COURSE_SCORE_METHOD_TWO = 2;
    public static final int COURSE_SCORE_METHOD_HUNDRED = 3;

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
    private Integer scoreMethod;
    private Integer preCourseId;
    private String suggestedSemester;
    private int status;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer expectedScore;

public CourseEntity(){}

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
    @Column(name = "course_structure_id")
    public Integer getCourseStructureId() {
        return courseStructureId;
    }

    public void setCourseStructureId(Integer courseStructureId) {
        this.courseStructureId = courseStructureId;
    }

    @Basic
    @Column(name = "course_module_id")
    public Integer getCourseModuleId() {
        return courseModuleId;
    }

    public void setCourseModuleId(Integer courseModuleId) {
        this.courseModuleId = courseModuleId;
    }

    @Basic
    @Column(name = "course_categroy_id")
    public Integer getCourseCategroyId() {
        return courseCategroyId;
    }

    public void setCourseCategroyId(Integer courseCategroyId) {
        this.courseCategroyId = courseCategroyId;
    }

    @Basic
    @Column(name = "course_group_id")
    public Integer getCourseGroupId() {
        return courseGroupId;
    }

    public void setCourseGroupId(Integer courseGroupId) {
        this.courseGroupId = courseGroupId;
    }

    @Basic
    @Column(name = "course_number")
    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Basic
    @Column(name = "course_name")
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Basic
    @Column(name = "credit")
    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    @Basic
    @Column(name = "is_compulsory")
    public Boolean getCompulsory() {
        return isCompulsory;
    }

    public void setCompulsory(Boolean compulsory) {
        isCompulsory = compulsory;
    }

    @Basic
    @Column(name = "is_elective")
    public Boolean getElective() {
        return isElective;
    }

    public void setElective(Boolean elective) {
        isElective = elective;
    }

    @Basic
    @Column(name = "is_theoretical")
    public Boolean getTheoretical() {
        return isTheoretical;
    }

    public void setTheoretical(Boolean theoretical) {
        isTheoretical = theoretical;
    }

    @Basic
    @Column(name = "is_practical")
    public Boolean getPractical() {
        return isPractical;
    }

    public void setPractical(Boolean practical) {
        isPractical = practical;
    }

    @Basic
    @Column(name = "total_hour")
    public String getTotalHour() {
        return totalHour;
    }

    public void setTotalHour(String totalHour) {
        this.totalHour = totalHour;
    }

    @Basic
    @Column(name = "theoretical_hour")
    public String getTheoreticalHour() {
        return theoreticalHour;
    }

    public void setTheoreticalHour(String theoreticalHour) {
        this.theoreticalHour = theoreticalHour;
    }

    @Basic
    @Column(name = "practical_hour")
    public String getPracticalHour() {
        return practicalHour;
    }

    public void setPracticalHour(String practicalHour) {
        this.practicalHour = practicalHour;
    }

    @Basic
    @Column(name = "is_test")
    public Boolean getTest() {
        return isTest;
    }

    public void setTest(Boolean test) {
        isTest = test;
    }

    @Basic
    @Column(name = "is_check")
    public Boolean getCheck() {
        return isCheck;
    }

    public void setCheck(Boolean check) {
        isCheck = check;
    }

    @Basic
    @Column(name = "score_method")
    public Integer getScoreMethod() {
        return scoreMethod;
    }

    public void setScoreMethod(Integer scoreMethod) {
        this.scoreMethod = scoreMethod;
    }

    @Basic
    @Column(name = "pre_course_id")
    public Integer getPreCourseId() {
        return preCourseId;
    }

    public void setPreCourseId(Integer preCourseId) {
        this.preCourseId = preCourseId;
    }

    @Basic
    @Column(name = "suggested_semester")
    public String getSuggestedSemester() {
        return suggestedSemester;
    }

    public void setSuggestedSemester(String suggestedSemester) {
        this.suggestedSemester = suggestedSemester;
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
        CourseEntity that = (CourseEntity) o;
        return id == that.id &&
                status == that.status &&
                Objects.equals(courseStructureId, that.courseStructureId) &&
                Objects.equals(courseModuleId, that.courseModuleId) &&
                Objects.equals(courseCategroyId, that.courseCategroyId) &&
                Objects.equals(courseGroupId, that.courseGroupId) &&
                Objects.equals(courseNumber, that.courseNumber) &&
                Objects.equals(courseName, that.courseName) &&
                Objects.equals(credit, that.credit) &&
                Objects.equals(isCompulsory, that.isCompulsory) &&
                Objects.equals(isElective, that.isElective) &&
                Objects.equals(isTheoretical, that.isTheoretical) &&
                Objects.equals(isPractical, that.isPractical) &&
                Objects.equals(totalHour, that.totalHour) &&
                Objects.equals(theoreticalHour, that.theoreticalHour) &&
                Objects.equals(practicalHour, that.practicalHour) &&
                Objects.equals(isTest, that.isTest) &&
                Objects.equals(isCheck, that.isCheck) &&
                Objects.equals(scoreMethod, that.scoreMethod) &&
                Objects.equals(preCourseId, that.preCourseId) &&
                Objects.equals(suggestedSemester, that.suggestedSemester);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, courseStructureId, courseModuleId, courseCategroyId, courseGroupId, courseNumber, courseName, credit, isCompulsory, isElective, isTheoretical, isPractical, totalHour, theoreticalHour, practicalHour, isTest, isCheck, scoreMethod, preCourseId, suggestedSemester,status);
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
    @Column(name = "expected_score")
    public Integer getExpectedScore() {
        return expectedScore;
    }

    public void setExpectedScore(Integer expectedScore) {
        this.expectedScore = expectedScore;
    }
}
