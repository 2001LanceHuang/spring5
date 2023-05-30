package com.itheima.proxy.aop;

/**
 * @author lance huang
 * @create 2023-05-11-19:31
 */
public class Target implements TargetInterface {
    @Override
    public void save() {
//        int i=1/0;
        System.out.println("save running....");
    }
}
