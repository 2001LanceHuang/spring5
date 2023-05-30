package com.itheima.demo;

import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lance huang
 * @create 2023-05-03-15:40
 */
public class UserController {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService service = (UserService) context.getBean("userService");
        UserService service = context.getBean("userService",UserService.class);
        service.save();
    }
}
