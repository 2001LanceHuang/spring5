package com.itheima.proxy.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author lance huang
 * @create 2023-05-13-10:44
 */
public class MyAspect {
    public void before(){
        System.out.println("前置通知");
    }
    public void afterRunning(){
        System.out.println("后置通知");
    }
    public Object around(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("环绕前通知");
        Object proceed = pjp.proceed();
        System.out.println("环绕后置通知...");
        return proceed;
    }
    public void afterThrowing(){
        System.out.println("异常抛出通知...");
    }
    public void after(){
        System.out.println("最终增强...");
    }
}
