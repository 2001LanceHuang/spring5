package com.itheima.service;

import com.itheima.domain.Role;

import java.util.List;

/**
 * @author lance huang
 * @create 2023-05-08-10:49
 */
public interface RoleService {
    public List<Role> list();

    void save(Role role);
}
