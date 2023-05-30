package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

/**
 * @author lance huang
 * @create 2023-05-03-15:27
 */
public class DynamicFactory {
    public  UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
