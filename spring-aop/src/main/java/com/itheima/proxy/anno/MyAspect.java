package com.itheima.proxy.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author lance huang
 * @create 2023-05-13-10:44
 */
@Component ("myAspect")
@Aspect  //标注当前myAspect是一个切面类
public class MyAspect {
    @Before("execution(* com.itheima.proxy.anno.*.*(..))")
    public void before(){
        System.out.println("前置通知");
    }

    public void afterRunning(){
        System.out.println("后置通知");
    }
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("环绕前通知");
        Object proceed = pjp.proceed();
        System.out.println("环绕后置通知...");
        return proceed;
    }
    public void afterThrowing(){
        System.out.println("异常抛出通知...");
    }
    @After("pointcut()")
    public void after(){
        System.out.println("最终增强...");
    }
    //定义切点表达式
    @Pointcut("execution(* com.itheima.proxy.anno.*.*(..))")
    public void pointcut(){
    }
}
