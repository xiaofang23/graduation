package com.example.graduation.dao.course;

import com.example.graduation.dao.BaseDao;
import com.example.graduation.entity.course.CourseEntity;
import com.example.graduation.entity.course.CourseStructureEntity;
import com.example.graduation.request.BaseRequest;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class CourseStructureDao extends BaseDao<CourseStructureEntity> {

    public CourseStructureDao(){
    }

    public List<CourseStructureEntity> getCourseStructureList(BaseRequest request){
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<CourseStructureEntity> query = builder.createQuery(CourseStructureEntity.class);
        Root<CourseStructureEntity> root = query.from(CourseStructureEntity.class);
        query.select(root);
        Predicate predicate = builder.gt(root.get("status"), 0);
        query.where(predicate);
        return  getSession().createQuery(query).list();
    }

}
