package com.itheima.listener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

/**
 * @author lance huang
 * @create 2023-05-04-18:41
 */
@WebListener
public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //读取web.xml中的全局参数
        ServletContext servletContext = sce.getServletContext();
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(contextConfigLocation);
        //将spring的应用上下文对象存储到ServletContext域中
        servletContext.setAttribute("context",context);
        System.out.println("spring容器创建完毕");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
