package com.yy.cloud.exceptionhandler;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class TulingExceptionHandler {

    @ExceptionHandler(value = {RuntimeException.class})
    @ResponseBody
    public Object dealBizException() {
        String body = "容错对象";
        return body;
    }
}
