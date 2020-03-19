package com.example.graduation.dao.course;

import com.example.graduation.dao.BaseDao;
import com.example.graduation.entity.course.StudentCourseEntity;
import com.example.graduation.entity.course.StudentGraduationPointEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class StudentCourseDao extends BaseDao<StudentCourseEntity> {
    public List<StudentCourseEntity> getByStudentId(int studentId) {
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<StudentCourseEntity> query = builder.createQuery(StudentCourseEntity.class);
        Root<StudentCourseEntity> root = query.from(StudentCourseEntity.class);
        query.select(root);

        Predicate predicate = builder.equal(root.get("studentId"),studentId);
        query.where(predicate);

        return getSession().createQuery(query).list();

    }
}
