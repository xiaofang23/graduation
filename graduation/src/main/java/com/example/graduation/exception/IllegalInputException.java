package com.example.graduation.exception;

import com.example.graduation.util.ErrorCodeType;

public class IllegalInputException extends Exception {

    private int code;
    private String msg;
    private Object data;

    public IllegalInputException(String msg){
        this.msg = msg;
        this.code = ErrorCodeType.ILLEGAL_INPUT_CODE;
        this.data = null;
    }

    public IllegalInputException(int code,String msg){
        this.msg = msg;
        this.code = code;
        this.data = null;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
