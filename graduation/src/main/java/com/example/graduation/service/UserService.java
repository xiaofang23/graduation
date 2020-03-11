package com.example.graduation.service;

import com.example.graduation.entity.user.AdminEntity;
import com.example.graduation.request.user.UserRegisterRequest;
import com.example.graduation.response.BaseResponse;
import com.example.graduation.util.PasswordEncryptUtil;
import com.example.graduation.validator.UserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
