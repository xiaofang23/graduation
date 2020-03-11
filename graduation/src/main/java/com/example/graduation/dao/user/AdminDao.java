package com.example.graduation.dao.user;

import com.example.graduation.dao.BaseDao;
import com.example.graduation.entity.user.AdminEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Repository
public class AdminDao extends BaseDao<AdminEntity> {
    public AdminEntity getByEmail(String email) {
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<AdminEntity> query = builder.createQuery(AdminEntity.class);
        Root<AdminEntity> root = query.from(AdminEntity.class);
        query.select(root);

        Predicate predicate = builder.equal(root.get("email"),email);
        query.where(predicate);
        return getSession().createQuery(query).getSingleResult();
    }
}
