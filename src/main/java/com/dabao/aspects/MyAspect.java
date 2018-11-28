package com.dabao.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class MyAspect  {
    Logger logger = LoggerFactory.getLogger(MyAspect.class);
    @Pointcut("execution(* com.dabao.controllers.*.*(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void doBefore(){
        System.out.println("before .....");
        logger.info("before....");

    }

    @After("pointcut()")
    public void doAfter(){
        System.out.println("after .....");
        logger.info("after.....");
    }
}
