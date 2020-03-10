package com.example.graduation.dao.course;

import com.example.graduation.dao.BaseDao;
import com.example.graduation.entity.course.GraduationPointCourseEvaResultEntity;
import com.example.graduation.entity.course.GraduationPointEvaResultEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Repository
public class GraduationPointEvaResultDao extends BaseDao<GraduationPointEvaResultEntity> {
    public GraduationPointEvaResultEntity getByPointIdAndStuLevel(int pointId, int stuLevel) {
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<GraduationPointEvaResultEntity> query = builder.createQuery(GraduationPointEvaResultEntity.class);
        Root<GraduationPointEvaResultEntity> root = query.from(GraduationPointEvaResultEntity.class);
        query.select(root);
        Predicate[] predicates = new Predicate[2];
        predicates[0] = builder.equal(root.get("pointCourseId"),pointId);
        predicates[1] = builder.equal(root.get("studentLevel"),stuLevel);
        Predicate predicate = builder.and(predicates);
        query.where(predicate);
        return getSession().createQuery(query).getSingleResult();
    }
}
