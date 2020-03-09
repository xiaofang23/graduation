package com.example.graduation.dao;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

public class BaseDao<T> extends DaoSupport implements IBaseDao<T>{
    private Class<?> entityClass;

    public BaseDao(){
        entityClass = this.getSuperClassType(getClass());
    }

    private Class<?> getSuperClassType(Class<? extends BaseDao> c) {
        Type type = c.getGenericSuperclass();
        if (type instanceof ParameterizedType) {
            Type[] params = ((ParameterizedType) type).getActualTypeArguments();
            if (!(params[0] instanceof Class)) {
                return Object.class;
            }
            return (Class<?>) params[0];
        }
        return null;
    }

    @Override
    public void save(T entity) {
        this.getHibernateTemplate().save(entity);
    }

    @Override
    public void delete(T entity) {
        this.getHibernateTemplate().delete(entity);
    }

    @Override
    public void update(T entity) {
        this.getHibernateTemplate().update(entity);
    }

    @Override
    public T getById(int id) {
        return (T) this.getHibernateTemplate().get(entityClass, id);
    }

    @Override
    public List<T> getAll() {
        return (List<T>) this.getHibernateTemplate().find("from "+entityClass.getSimpleName());
    }
}
