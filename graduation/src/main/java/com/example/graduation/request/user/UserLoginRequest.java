package com.example.graduation.request.user;

import javax.validation.constraints.NotNull;

public class UserLoginRequest {

    public static final int USER_TYPE_ADMIN = 1;
    public static final int USER_TYPE_TEACHER = 2;
    public static final int USER_TYPE_STUDENT = 3;

    @NotNull(message = "邮箱不能为空")
    private String email;
    @NotNull(message = "密码不能为空")
    private String password;
    private int userType;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }
}
