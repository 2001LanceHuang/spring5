package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author lance huang
 * @create 2023-05-03-22:50
 */
//<bean id="userService" class="com.itheima.service.impl.UserServiceImpl"></bean>
//@Component("userService")
@Service("userService")
@Scope("singleton")//scope=singleton
public class UserServiceImpl implements UserService {
    @Value("${jdbc.driver}")
    private String driver;
//    <property name="userDao" ref="userDao"></property>
    @Autowired//按照数据类型从spring容器中进行匹配的
    @Qualifier("userDao")//是按照id的名称从容器中进行匹配的，但是此处的@Qualifier需要结合@Autowired一起使用
    private UserDao userDao;

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void save() {
        System.out.println(driver);
        userDao.save();
    }

}
