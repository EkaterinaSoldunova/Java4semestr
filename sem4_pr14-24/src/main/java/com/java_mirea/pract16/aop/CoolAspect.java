package com.java_mirea.pract16.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j //19
@Aspect //20
@Component
public class CoolAspect {
    @Before("within(com.java_mirea.pract16.service.*)") //20
    public void BeforeLoggingAdvice(JoinPoint joinPoint){
        log.info("Pameters: {}", joinPoint.getArgs());
    }
}
