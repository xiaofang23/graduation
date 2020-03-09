package com.example.graduation.dao;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public interface IBaseDao<T> {

     void save(T entity);

     void delete(T entity);

     void update(T entity);

     T getById(int id);

     List<T> getAll();

}
