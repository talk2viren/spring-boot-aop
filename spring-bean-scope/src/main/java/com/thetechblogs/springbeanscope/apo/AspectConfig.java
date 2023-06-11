package com.thetechblogs.springbeanscope.apo;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

//https://www.javainuse.com/spring/spring-boot-aop

@Configuration
@Aspect
@Slf4j
public class AspectConfig {

//    @Before(value = "execution(* com.javainuse.service.EmployeeService.*(..)) and args(name,empId"))
//    public void beforeAdvice(JoinPoint joinPoint,String name,String empId){
//
//    }


}
