package com.example.graduation.dao.course;

import com.example.graduation.dao.BaseDao;
import com.example.graduation.entity.course.GraduationPointCourseEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class GraduationPointCourseDao extends BaseDao<GraduationPointCourseEntity> {
    public List<GraduationPointCourseEntity> getByCourseIdAndPointIdAndStuLevel(Integer courseId, Integer pointId) {
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<GraduationPointCourseEntity> query = builder.createQuery(GraduationPointCourseEntity.class);
        Root<GraduationPointCourseEntity> root = query.from(GraduationPointCourseEntity.class);
        query.select(root);

        List<Predicate> predicates = new ArrayList<>();
        if(courseId!=null){
            Predicate predicate = builder.equal(root.get("courseId"),courseId);
            predicates.add(predicate);
        }
        if(pointId!=null){
            Predicate predicate = builder.equal(root.get("pointId"),pointId);
            predicates.add(predicate);
        }
        Predicate[] predicateArr = new Predicate[predicates.size()];
        predicates.toArray(predicateArr);
        Predicate predicate = builder.and(predicateArr);
        query.where(predicate);
        return getSession().createQuery(query).list();
    }
}
