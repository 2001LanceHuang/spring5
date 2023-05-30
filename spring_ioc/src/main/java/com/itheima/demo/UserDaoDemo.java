package com.itheima.demo;

import com.itheima.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lance huang
 * @create 2023-05-03-15:18
 */
public class UserDaoDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.save();
    }
}
