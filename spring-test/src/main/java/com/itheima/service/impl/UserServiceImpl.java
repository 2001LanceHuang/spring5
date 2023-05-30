package com.itheima.service.impl;

import com.itheima.dao.RoleDao;
import com.itheima.dao.UserDao;
import com.itheima.domain.Role;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

/**
 * @author lance huang
 * @create 2023-05-08-21:38
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<User> list() {
        List<User> userList = userDao.findAll();
        //封装userList中每个User的roles数据
        for (User user : userList) {
        //获得user的id
            Long id = user.getId();
            //将id作为参数查询当前userId对应的role集合数据
            List<Role> roles =roleDao.findRoleByUserId(id);
            user.setRoles(roles);
        }
        return userList;
    }

    @Override
    public void save(User user, long[] roleIds) {
        //第一步向sys_user表中存数据
        Long userId = userDao.save(user);
        //第二部 向sys_user_role表中存储多条数据
        userDao.saveUserRoleRel(userId,roleIds);
    }

    @Override
    public void del(Long userId) {
        //1.删除sys_user_role关系表
        userDao.delUserRoleRel(userId);
        //2.删除sys_user表
        userDao.del(userId);
    }

    @Override
    public User login(String username, String password) {
        try {
            User user = userDao.findUsernameAndPassword(username,password);
            return user;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
