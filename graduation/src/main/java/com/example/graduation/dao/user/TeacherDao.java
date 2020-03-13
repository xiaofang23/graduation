package com.example.graduation.dao.user;

import com.example.graduation.dao.BaseDao;
import com.example.graduation.entity.user.AdminEntity;
import com.example.graduation.entity.user.TeacherEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Repository
public class TeacherDao extends BaseDao<TeacherEntity> {
    public TeacherEntity getByEmail(String email) {
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<TeacherEntity> query = builder.createQuery(TeacherEntity.class);
        Root<TeacherEntity> root = query.from(TeacherEntity.class);
        query.select(root);

        Predicate predicate = builder.equal(root.get("email"),email);
        query.where(predicate);
        return getSession().createQuery(query).getSingleResult();
    }
}
