package com.itheima.proxy.cglib;

import com.itheima.proxy.jdk.TargetInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lance huang
 * @create 2023-05-11-19:34
 */
public class ProxyTest {
    public static void main(String[] args) {
        //创建目标对象
        Target target = new Target();
        //增强对象
        Advice advice = new Advice();

    }
}
