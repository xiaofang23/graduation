package com.example.graduation.dao.course;

import com.example.graduation.dao.BaseDao;
import com.example.graduation.entity.course.CourseGroupEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class CourseGroupDao extends BaseDao<CourseGroupEntity> {

    public CourseGroupDao(){}

    public List<CourseGroupEntity> getByCategoryId(int categoryId) {
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<CourseGroupEntity> query = builder.createQuery(CourseGroupEntity.class);

        Root<CourseGroupEntity> root = query.from(CourseGroupEntity.class);
        query.select(root);

        Predicate predicate = builder.equal(root.get("categoryId"),categoryId);
        query.where(predicate);
        return getSession().createQuery(query).list();
    }

}
