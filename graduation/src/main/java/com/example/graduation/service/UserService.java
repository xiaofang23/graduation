package com.example.graduation.service;

import com.alibaba.fastjson.JSON;
import com.example.graduation.entity.user.AdminEntity;
import com.example.graduation.entity.user.StudentEntity;
import com.example.graduation.entity.user.TeacherEntity;
import com.example.graduation.exception.IllegalInputException;
import com.example.graduation.request.user.UserLoginRequest;
import com.example.graduation.request.user.UserRegisterRequest;
import com.example.graduation.response.BaseResponse;
import com.example.graduation.util.PasswordEncryptUtil;
import com.example.graduation.util.TimeUtil;
import com.example.graduation.validator.UserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;

@Service
public class UserService extends BaseService {

    protected final UserValidation userValidation;

    public UserService(UserValidation userValidation) {
        this.userValidation = userValidation;
    }

    @Transactional
    public BaseResponse adminRegister(UserRegisterRequest request) {
        userValidation.validateEmailCanBeRegisterAdmin(request.getEmail());

        AdminEntity adminEntity = new AdminEntity();
        adminEntity.setAdminName(request.getName());
        adminEntity.setPassword(PasswordEncryptUtil.encryptPassword(request.getPassword()));
        adminEntity.setMail(request.getEmail());
        adminEntity.setStatus(AdminEntity.USER_STATUS_ACTIVE);
        adminEntity.setCreateTime(new Timestamp(System.currentTimeMillis()));

        adminDao.save(adminEntity);
        return new BaseResponse();
    }

    @Transactional(readOnly = true)
    public BaseResponse userLogin(UserLoginRequest request, HttpSession session) {
        switch (request.getUserType()){
            case UserLoginRequest.USER_TYPE_ADMIN:
                return adminLogin(request,session);
            case UserLoginRequest.USER_TYPE_TEACHER:
                return teacherLogin(request,session);
            case UserLoginRequest.USER_TYPE_STUDENT:
                return studentLogin(request,session);
            default:
                try {
                    throw new IllegalInputException("输入非法用户类型");
                } catch (IllegalInputException e) {
                    e.printStackTrace();
                }
        }
        return new BaseResponse();
    }

    // TODO: 2020/3/13  登录状态管理 将使用redis
    private BaseResponse studentLogin(UserLoginRequest request, HttpSession session) {
        StudentEntity studentEntity = userValidation.validateStudentLogin(request);
        redisTemplate.opsForValue().set(session.getId(), JSON.toJSONString(studentEntity), TimeUtil.TIME_TWENTY_MINUTE);
        return new BaseResponse();
    }

    private BaseResponse teacherLogin(UserLoginRequest request, HttpSession session) {
        TeacherEntity teacherEntity = userValidation.validateTeacherLogin(request);
        redisTemplate.opsForValue().set(session.getId(),JSON.toJSONString(teacherEntity), TimeUtil.TIME_TWENTY_MINUTE);
        return new BaseResponse();
    }

    private BaseResponse adminLogin(UserLoginRequest request, HttpSession session) {
        AdminEntity adminEntity = userValidation.validateAdminLogin(request);
        redisTemplate.opsForValue().set(session.getId(),JSON.toJSONString(adminEntity), TimeUtil.TIME_TWENTY_MINUTE);
        return new BaseResponse();
    }
}
