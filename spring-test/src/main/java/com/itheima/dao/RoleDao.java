package com.itheima.dao;

import com.itheima.domain.Role;

import java.util.List;

/**
 * @author lance huang
 * @create 2023-05-08-10:59
 */
public interface RoleDao {
    List<Role> findAll();

    void save(Role role);


//    List<Role> findRoleByUserId(Long id);

    List<Role> findRoleByUserId(long id);
}
