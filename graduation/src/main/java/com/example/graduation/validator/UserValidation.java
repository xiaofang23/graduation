package com.example.graduation.validator;

import com.example.graduation.entity.user.AdminEntity;
import com.example.graduation.exception.IllegalInputException;
import com.example.graduation.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class UserValidation extends BaseService {
    public void validateEmailCanBeRegisterAdmin(String email) {
        AdminEntity adminEntity = adminDao.getByEmail(email);
        if(adminEntity!=null){
            try {
                throw new IllegalInputException("此邮箱已注册");
            } catch (IllegalInputException e) {
                e.printStackTrace();
            }
        }
    }
}
