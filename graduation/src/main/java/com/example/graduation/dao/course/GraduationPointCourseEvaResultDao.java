package com.example.graduation.dao.course;

import com.example.graduation.dao.BaseDao;
import com.example.graduation.entity.course.CourseEntity;
import com.example.graduation.entity.course.GraduationPointCourseEvaResultEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class GraduationPointCourseEvaResultDao extends BaseDao<GraduationPointCourseEvaResultEntity> {


    public List<GraduationPointCourseEvaResultEntity> getByPointCourseIds(List<Integer> pointCourseIds) {
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<GraduationPointCourseEvaResultEntity> query = builder.createQuery(GraduationPointCourseEvaResultEntity.class);
        //query.from类似于sql中的from语句,from course
        Root<GraduationPointCourseEvaResultEntity> root = query.from(GraduationPointCourseEvaResultEntity.class);
        query.select(root);
        Path<Integer> path = root.get("pointCourseId");
        query.where(path.in(pointCourseIds));
        return getSession().createQuery(query).list();
    }

}
