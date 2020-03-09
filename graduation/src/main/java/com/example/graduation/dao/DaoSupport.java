package com.example.graduation.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import javax.persistence.EntityManagerFactory;

public class DaoSupport{

    @Autowired
    private EntityManagerFactory entityManagerFactory;
    /**获取sessionFactory*/
    private SessionFactory getSessionFactory() {
        return entityManagerFactory.unwrap(SessionFactory.class);
    }
    public HibernateTemplate getHibernateTemplate(){
        return new HibernateTemplate(getSessionFactory());
    }

    public Session getSession(){
        return getSessionFactory().getCurrentSession();
    }
}
