package com.itheima.proxy.cglib;

/**
 * @author lance huang
 * @create 2023-05-11-19:32
 */
public class Advice {
    public void before(){
        System.out.println("前置增强..");
    }
    public void afterReturning(){
        System.out.println("后置增强");
    }
}
