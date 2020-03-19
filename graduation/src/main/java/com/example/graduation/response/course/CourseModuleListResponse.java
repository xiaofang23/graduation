package com.example.graduation.response.course;

import com.example.graduation.entity.VO.course.CourseModuleEntityVO;

import java.util.List;

public class CourseModuleListResponse {

    private int count;
    private List<CourseModuleEntityVO> moduleEntityVOList;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<CourseModuleEntityVO> getModuleEntityVOList() {
        return moduleEntityVOList;
    }

    public void setModuleEntityVOList(List<CourseModuleEntityVO> moduleEntityVOList) {
        this.moduleEntityVOList = moduleEntityVOList;
    }
}
