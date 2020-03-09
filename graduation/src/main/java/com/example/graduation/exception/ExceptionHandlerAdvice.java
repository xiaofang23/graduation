package com.example.graduation.exception;


import com.example.graduation.response.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
@ResponseBody
public class ExceptionHandlerAdvice {

    @ExceptionHandler(IllegalInputException.class)
    public ErrorResponse exceptionHandler(IllegalInputException e){
        e.printStackTrace();
        ErrorResponse response = new ErrorResponse(e.getCode(),e.getMsg(),e.getData());
        return response;
    }

}
