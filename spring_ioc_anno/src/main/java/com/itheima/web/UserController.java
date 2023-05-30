package com.itheima.web;

import com.itheima.config.SpringConfiguration;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lance huang
 * @create 2023-05-04-11:03
 */
public class UserController {
    public static void main(String[] args) {
        //基于xml配置文件来实现
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = context.getBean(UserService.class);
//        userService.save();
        //基于spring的核心配置类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = context.getBean(UserService.class);
        userService.save();
    }
}
