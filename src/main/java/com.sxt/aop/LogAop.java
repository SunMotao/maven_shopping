package com.sxt.aop;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by 57056 on 2018/3/8.
 */
@Aspect
public class LogAop {
    @Around(value = ("execution(* com.sxt.dao..*.*(..))"))
    public Object around(){
        return null;
    }
}
