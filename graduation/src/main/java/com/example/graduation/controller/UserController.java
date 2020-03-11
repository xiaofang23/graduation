package com.example.graduation.controller;

import com.example.graduation.request.user.UserRegisterRequest;
import com.example.graduation.response.BaseResponse;
import com.example.graduation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register/admin",method = RequestMethod.POST)
    public BaseResponse AdminRegister(@RequestBody UserRegisterRequest request){
        return userService.adminRegister(request);
    }

}
