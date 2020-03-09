package com.example.graduation.dao.course;

import com.example.graduation.dao.BaseDao;
import com.example.graduation.entity.course.CourseEntity;
import com.example.graduation.request.BaseRequest;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;


import javax.persistence.criteria.*;
import java.util.List;

@Repository
public class CourseDao extends BaseDao<CourseEntity> {

    public CourseDao(){
    }


    public List<CourseEntity> getCourseList(BaseRequest request){
        String hql = "from " + CourseEntity.class.getSimpleName();
        Query query = getSession().createQuery(hql);
        query.setFirstResult((request.getPageNum()-1)*request.getPageSize());
        query.setMaxResults(request.getPageSize());
        List<CourseEntity> list = query.list();
        return list;
    }

    public int getCourseCount(){
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<Long> query = builder.createQuery(Long.class);

        //query.from类似于sql中的from语句,from course
        Root<CourseEntity> root = query.from(CourseEntity.class);
        query.select(builder.count(root.get("id")));

        //该predicate也就是在where后面的条件子句
        //Predicate predicate = criteriaBuilder.gt(root.get("id"), 2);
        //query.where(predicate);
        int count = Math.toIntExact(getSession().createQuery(query).getSingleResult());
        return count;

    }

    public List<CourseEntity> getByGroupId(int groupId) {
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<CourseEntity> query = builder.createQuery(CourseEntity.class);

        //query.from类似于sql中的from语句,from course
        Root<CourseEntity> root = query.from(CourseEntity.class);
        query.select(root);

        Predicate predicate = builder.equal(root.get("courseGroupId"),groupId);
        query.where(predicate);

        return getSession().createQuery(query).list();

    }

    public List<CourseEntity> getByIds(List<Integer> courseIds) {
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<CourseEntity> query = builder.createQuery(CourseEntity.class);
        //query.from类似于sql中的from语句,from course
        Root<CourseEntity> root = query.from(CourseEntity.class);
        query.select(root);
        Path<Integer> path = root.get("courseId");
        query.where(path.in(courseIds));

        return getSession().createQuery(query).list();
    }
}
