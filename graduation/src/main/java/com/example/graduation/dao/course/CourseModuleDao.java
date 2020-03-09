package com.example.graduation.dao.course;

import com.example.graduation.dao.BaseDao;
import com.example.graduation.entity.course.CourseModuleEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


@Repository
public class CourseModuleDao extends BaseDao<CourseModuleEntity> {

    public CourseModuleDao(){}

    public List<CourseModuleEntity> getByStructureId() {
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<CourseModuleEntity> query = builder.createQuery(CourseModuleEntity.class);
        Root<CourseModuleEntity> root = query.from(CourseModuleEntity.class);
        query.select(root);
        return getSession().createQuery(query).list();
    }

}
