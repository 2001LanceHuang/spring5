package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

/**
 * @author lance huang
 * @create 2023-05-08-21:37
 */
public interface UserService {
    List<User> list();

    void save(User user, long[] roleIds);

    void del(Long userId);

    User login(String username, String password);
}
