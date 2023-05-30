package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 * @author lance huang
 * @create 2023-05-08-21:40
 */
public interface UserDao {
    List<User> findAll();

    Long save(User user);

    void saveUserRoleRel(Long id, long[] roleIds);

    void delUserRoleRel(Long userId);

    void del(Long userId);

    User findUsernameAndPassword(String username, String password);
}
