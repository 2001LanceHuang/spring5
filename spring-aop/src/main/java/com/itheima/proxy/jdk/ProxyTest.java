package com.itheima.proxy.jdk;

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

        //返回值就是动态生成的代理对象
        TargetInterface proxy= (TargetInterface) Proxy.newProxyInstance(
                //目标对象类加载器
                target.getClass().getClassLoader(),
                //目标对象相同的接口字节码数组
                target.getClass().getInterfaces(),
                //调用代理的任何方法 实质执行的是invoke方法
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //前置增强
                        advice.before();
                        //执行目标方法
                        Object invoke = method.invoke(target, args);
                        //后置增强
                        advice.afterReturning();
                        return invoke;
                    }
                }
        );
        //调用代理对象的方法
        proxy.save();
    }
}
