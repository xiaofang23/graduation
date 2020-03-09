package com.example.graduation.dao.course;

import com.example.graduation.dao.BaseDao;
import com.example.graduation.entity.course.CourseCategoryEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class CourseCategoryDao extends BaseDao<CourseCategoryEntity> {

    public CourseCategoryDao(){}

    public List<CourseCategoryEntity> getByModuleIds(int moduleId) {
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<CourseCategoryEntity> query = builder.createQuery(CourseCategoryEntity.class);

        Root<CourseCategoryEntity> root = query.from(CourseCategoryEntity.class);
        query.select(root);
        Predicate predicate = builder.equal(root.get("moduleId"),moduleId);
        query.where(predicate);
        return getSession().createQuery(query).list();

    }

}
