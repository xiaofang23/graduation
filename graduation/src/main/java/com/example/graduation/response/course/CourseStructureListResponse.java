package com.example.graduation.response.course;

import com.example.graduation.entity.VO.course.CourseStructureEntityVO;
import com.example.graduation.response.BaseResponse;

import java.util.List;

public class CourseStructureListResponse extends BaseResponse {

    private int count;
    private List<CourseStructureEntityVO> structureEntityVOList;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<CourseStructureEntityVO> getStructureEntityVOList() {
        return structureEntityVOList;
    }

    public void setStructureEntityVOList(List<CourseStructureEntityVO> structureEntityVOList) {
        this.structureEntityVOList = structureEntityVOList;
    }
}
