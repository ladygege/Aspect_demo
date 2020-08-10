package com.example.aspect_demo.aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
//@Component
public class TestAspect {
    @Before("execution(* com.example.aspect_demo.controller.TestController.sayHello(..))")
    public void before() {
        System.out.println("招手");
    }
    @After("execution(* com.example.aspect_demo.controller.TestController.sayHello(..))")
    public void after(){
        System.out.println("手放下");
    }
}
