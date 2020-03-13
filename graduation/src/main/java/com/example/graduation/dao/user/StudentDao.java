package com.example.graduation.dao.user;

import com.example.graduation.dao.BaseDao;
import com.example.graduation.entity.user.StudentEntity;
import com.example.graduation.entity.user.TeacherEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Repository
public class StudentDao extends BaseDao<StudentEntity> {
    public StudentEntity getByEmail(String email) {
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<StudentEntity> query = builder.createQuery(StudentEntity.class);
        Root<StudentEntity> root = query.from(StudentEntity.class);
        query.select(root);

        Predicate predicate = builder.equal(root.get("email"),email);
        query.where(predicate);
        return getSession().createQuery(query).getSingleResult();
    }
}
