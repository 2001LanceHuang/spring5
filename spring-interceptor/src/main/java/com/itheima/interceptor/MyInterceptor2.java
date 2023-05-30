package com.itheima.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lance huang
 * @create 2023-05-10-11:34
 */
public class MyInterceptor2 implements HandlerInterceptor {
    //在目标方法执行之前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle222...");
         return true;
    }
    //在目标方法执行之后，视图对象返回之前执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle222...");
        modelAndView.addObject("name","itheima");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }
    //整个流程都执行完毕之后 执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion222...");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
