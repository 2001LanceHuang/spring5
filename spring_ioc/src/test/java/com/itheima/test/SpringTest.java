package com.itheima.test;

import com.itheima.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lance huang
 * @create 2023-05-03-15:10
 */
public class SpringTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) context.getBean("userDao");
        System.out.println(userDao1);
    }
}
