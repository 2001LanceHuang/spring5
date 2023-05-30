package com.itheima.dao;

import com.itheima.domain.User;

import java.io.IOException;
import java.util.List;

/**
 * @author lance huang
 * @create 2023-05-22-16:27
 */
public interface UserMapper {
    public List<User> findAll() throws IOException;
    public User findById(int id);
}
