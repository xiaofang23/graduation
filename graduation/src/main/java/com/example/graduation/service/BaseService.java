package com.example.graduation.service;

import com.example.graduation.dao.DaoSupport;
import com.example.graduation.dao.attacher.CourseAttach;
import com.example.graduation.dao.course.*;
import com.example.graduation.entity.course.GraduationPointCourseEvaResultEntity;
import com.example.graduation.validator.CourseValidation;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService extends DaoSupport {

    @Autowired
    protected CourseDao courseDao;

    @Autowired
    protected CourseGroupDao courseGroupDao;

    @Autowired
    protected CourseCategoryDao courseCategoryDao;

    @Autowired
    protected CourseModuleDao courseModuleDao;

    @Autowired
    protected CourseStructureDao courseStructureDao;

    @Autowired
    protected CourseEvaResultDao courseEvaResultDao;

    @Autowired
    protected GraduationPointCourseDao graduationPointCourseDao;

    @Autowired
    protected GraduationPointDao graduationPointDao;

    @Autowired
    protected GraduationPointCourseEvaResultDao graduationPointCourseEvaResultDao;

    @Autowired
    protected CourseValidation courseValidation;


}
