package com.itheima.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author lance huang
 * @create 2023-05-07-17:42
 */
public class JdbcTemplateTest {
    //测试spring产生JdbcTemplate对象
    @Test
    public void test1(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = app.getBean(JdbcTemplate.class);
        int rows=jdbcTemplate.update("insert into account values(?,?)","余紫云",50000);
        System.out.println(rows);
    }
    @Test
    public void test2(){

    }
}
