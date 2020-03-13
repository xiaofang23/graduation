package com.example.graduation.validator;

import com.example.graduation.entity.user.AdminEntity;
import com.example.graduation.entity.user.StudentEntity;
import com.example.graduation.entity.user.TeacherEntity;
import com.example.graduation.exception.IllegalInputException;
import com.example.graduation.request.user.UserLoginRequest;
import com.example.graduation.service.BaseService;
import com.example.graduation.util.PasswordEncryptUtil;
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

    public AdminEntity validateAdminLogin(UserLoginRequest request) {
        AdminEntity adminEntity = adminDao.getByEmail(request.getEmail());
        if(adminEntity==null){
            try {
                throw new IllegalInputException("该邮箱不存在");
            } catch (IllegalInputException e) {
                e.printStackTrace();
            }
        }
        String psd = PasswordEncryptUtil.encryptPassword(request.getPassword());
        if(psd == adminEntity.getPassword()){
            return adminEntity;
        }else {
            try {
                throw new IllegalInputException("密码不正确");
            } catch (IllegalInputException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public TeacherEntity validateTeacherLogin(UserLoginRequest request) {
        TeacherEntity teacherEntity = teacherDao.getByEmail(request.getEmail());
        if(teacherEntity==null){
            try {
                throw new IllegalInputException("该邮箱不存在");
            } catch (IllegalInputException e) {
                e.printStackTrace();
            }
        }
        String psd = PasswordEncryptUtil.encryptPassword(request.getPassword());
        if(psd == teacherEntity.getPassword()){
            return teacherEntity;
        }else {
            try {
                throw new IllegalInputException("密码不正确");
            } catch (IllegalInputException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public StudentEntity validateStudentLogin(UserLoginRequest request) {
        StudentEntity studentEntity = studentDao.getByEmail(request.getEmail());
        if(studentEntity==null){
            try {
                throw new IllegalInputException("该邮箱不存在");
            } catch (IllegalInputException e) {
                e.printStackTrace();
            }
        }
        String psd = PasswordEncryptUtil.encryptPassword(request.getPassword());
        if(psd == studentEntity.getPassword()){
            return studentEntity;
        }else {
            try {
                throw new IllegalInputException("密码不正确");
            } catch (IllegalInputException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
