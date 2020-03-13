package com.example.graduation.interceptor;


import com.alibaba.fastjson.JSON;
import com.example.graduation.entity.user.AdminEntity;
import com.example.graduation.entity.user.StudentEntity;
import com.example.graduation.entity.user.TeacherEntity;
import com.example.graduation.exception.IllegalInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session=request.getSession();
        //检测redis中是否含有sessionId
        String val= (String) redisTemplate.opsForValue().get(session.getId());
        if(null!=val){

            Object obj = JSON.parse(val);
            if(obj instanceof AdminEntity){
                AdminEntity adminEntity = (AdminEntity)obj;
                request.setAttribute("user",adminEntity);
            }else if(obj instanceof TeacherEntity){
                TeacherEntity teacherEntity = (TeacherEntity)obj;
                request.setAttribute("user",teacherEntity);
            }else if(obj instanceof StudentEntity){
                StudentEntity studentEntity = (StudentEntity)obj;
                request.setAttribute("user",studentEntity);
            }else {
                throw new IllegalInputException("系统用户未登录");
            }
            return true;
        }else{
            response.setStatus(401);
            throw new IllegalInputException("系统用户未登录");
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }


}
