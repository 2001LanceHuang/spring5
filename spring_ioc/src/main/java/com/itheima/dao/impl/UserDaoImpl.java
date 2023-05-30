package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.springframework.objenesis.instantiator.perc.PercInstantiator;

import java.util.List;
import java.util.Map;
import java.util.PrimitiveIterator;
import java.util.Properties;

/**
 * @author lance huang
 * @create 2023-05-03-15:06
 */
public class UserDaoImpl implements UserDao {
    private String username;
    private int age;
    private List<String> stringList;
    private Map<String, User> userMap;
    private Properties properties;

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //    public UserDaoImpl() {
//        System.out.println("UserDaoImpl被创建");
//    }

    @Override
    public void save() {
//        System.out.println(username+"===="+age);
        System.out.println(stringList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("save running....");
    }
}
