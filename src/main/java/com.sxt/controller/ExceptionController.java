package com.sxt.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by 57056 on 2018/3/9.
 */
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler
    public String error500(NullPointerException e){
        System.out.println("程序出现异常");
        return "redirect:/staticPages/500.html";
    }

}
