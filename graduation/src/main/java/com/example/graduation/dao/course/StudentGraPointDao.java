package com.example.graduation.dao.course;

import com.example.graduation.dao.BaseDao;
import com.example.graduation.entity.course.GraduationPointEvaResultEntity;
import com.example.graduation.entity.course.StudentGraduationPointEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class StudentGraPointDao extends BaseDao<StudentGraduationPointEntity> {


    public List<StudentGraduationPointEntity> getListByStudents(int studentId){
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<StudentGraduationPointEntity> query = builder.createQuery(StudentGraduationPointEntity.class);
        Root<StudentGraduationPointEntity> root = query.from(StudentGraduationPointEntity.class);
        query.select(root);

        Predicate predicate = builder.equal(root.get("studentId"),studentId);
        query.where(predicate);

        return getSession().createQuery(query).list();

    }

    public StudentGraduationPointEntity getByStudentIdAndPointId(int studentId, int pointId) {
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<StudentGraduationPointEntity> query = builder.createQuery(StudentGraduationPointEntity.class);
        Root<StudentGraduationPointEntity> root = query.from(StudentGraduationPointEntity.class);
        query.select(root);
        Predicate[] predicates = new Predicate[2];
        predicates[0] = builder.equal(root.get("studentId"),studentId);
        predicates[1] = builder.equal(root.get("pointId"),pointId);
        Predicate predicate = builder.and(predicates);
        query.where(predicate);
        return getSession().createQuery(query).getSingleResult();
    }
}
