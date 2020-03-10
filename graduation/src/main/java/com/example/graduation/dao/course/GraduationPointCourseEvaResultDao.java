package com.example.graduation.dao.course;

import com.example.graduation.dao.BaseDao;
import com.example.graduation.entity.course.CourseEntity;
import com.example.graduation.entity.course.CourseEvaResultEntity;
import com.example.graduation.entity.course.GraduationPointCourseEvaResultEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.*;
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

    public GraduationPointCourseEvaResultEntity getByPointCourseIdAndStuLevel(int pointCourseId, int student_level) {
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<GraduationPointCourseEvaResultEntity> query = builder.createQuery(GraduationPointCourseEvaResultEntity.class);
        Root<GraduationPointCourseEvaResultEntity> root = query.from(GraduationPointCourseEvaResultEntity.class);
        query.select(root);
        Predicate[] predicates = new Predicate[2];
        predicates[0] = builder.equal(root.get("pointCourseId"),pointCourseId);
        predicates[1] = builder.equal(root.get("studentLevel"),student_level);
        Predicate predicate = builder.and(predicates);
        query.where(predicate);
        return getSession().createQuery(query).getSingleResult();
    }

    public List<GraduationPointCourseEvaResultEntity> getByPointCourseIdsAndStuLevel(List<Integer> pointCourseIds, int stuLevel) {
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<GraduationPointCourseEvaResultEntity> query = builder.createQuery(GraduationPointCourseEvaResultEntity.class);
        //query.from类似于sql中的from语句,from course
        Root<GraduationPointCourseEvaResultEntity> root = query.from(GraduationPointCourseEvaResultEntity.class);
        query.select(root);
        Path<Integer> path = root.get("pointCourseId");
        Predicate[] predicates = new Predicate[2];
        predicates[0] = path.in(pointCourseIds);
        predicates[1] = builder.equal(root.get("studentLevel"),stuLevel);
        Predicate predicate = builder.and(predicates);
        query.where(predicate);
        return getSession().createQuery(query).list();
    }
}
