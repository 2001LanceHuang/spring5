package com.itheima.proxy.jdk;

/**
 * @author lance huang
 * @create 2023-05-11-19:31
 */
public class Target implements TargetInterface{
    @Override
    public void save() {
        System.out.println("save running....");
    }
}
