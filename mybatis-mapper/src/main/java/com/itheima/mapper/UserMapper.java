package com.itheima.mapper;

import com.itheima.domain.User;

import java.util.List;

/**
 * @author lance huang
 * @create 2023-05-23-10:32
 */
public interface UserMapper {
    public List<User> findByCondition(User user);
    public List<User> findByIds(List<Integer> ids);
}
