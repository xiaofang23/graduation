package com.example.graduation.controller;

import com.example.graduation.request.BaseRequest;
import com.example.graduation.request.user.UserLoginRequest;
import com.example.graduation.request.user.UserRegisterRequest;
import com.example.graduation.response.BaseResponse;
import com.example.graduation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register/admin",method = RequestMethod.POST)
    public BaseResponse adminRegister(@RequestBody UserRegisterRequest request){
        return userService.adminRegister(request);
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public BaseResponse userLogin(@RequestBody UserLoginRequest request, HttpSession session){
        return userService.userLogin(request,session);
    }

    public BaseResponse userLogout(@RequestBody BaseRequest request,HttpSession session){
        return userService.userLogout(request,session);
    }

}
