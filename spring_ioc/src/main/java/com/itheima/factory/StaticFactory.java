package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

/**
 * @author lance huang
 * @create 2023-05-03-15:00
 */
public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }

}
