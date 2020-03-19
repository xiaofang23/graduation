package com.example.graduation.response.course;

import com.example.graduation.entity.VO.user.StudentGraduationPointEntityVO;

import java.util.List;

public class StudentGraPointListResponse {

    private List<StudentGraduationPointEntityVO> stuPoints;

    public List<StudentGraduationPointEntityVO> getStuPoints() {
        return stuPoints;
    }

    public void setStuPoints(List<StudentGraduationPointEntityVO> stuPoints) {
        this.stuPoints = stuPoints;
    }
}
