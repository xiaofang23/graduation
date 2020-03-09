package com.example.graduation.dao.course;

import com.example.graduation.dao.BaseDao;
import com.example.graduation.entity.course.CourseEvaResultEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Repository
public class CourseEvaResultDao extends BaseDao<CourseEvaResultEntity> {


    public CourseEvaResultEntity getByCourseIDAndStuLevel(int courseId,int stuLevel){
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<CourseEvaResultEntity> query = builder.createQuery(CourseEvaResultEntity.class);
        Root<CourseEvaResultEntity> root = query.from(CourseEvaResultEntity.class);
        query.select(root);
        Predicate[] predicates = new Predicate[2];
        predicates[0] = builder.equal(root.get("courseId"),courseId);
        predicates[1] = builder.equal(root.get("studentLevel"),stuLevel);
        Predicate predicate = builder.and(predicates);
        query.where(predicate);
        return getSession().createQuery(query).getSingleResult();
    }

}
