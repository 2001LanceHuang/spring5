package com.itheima.controller;

import com.itheima.domain.User;

import java.util.List;

/**
 * @author lance huang
 * @create 2023-05-05-22:19
 */
public class VO {
    private List<User> userList;

    public VO() {
    }

    public VO(List<User> userList) {
        this.userList = userList;
    }

    /**
     * 获取
     * @return userList
     */
    public List<User> getUserList() {
        return userList;
    }

    /**
     * 设置
     * @param userList
     */
    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public String toString() {
        return "VO{userList = " + userList + "}";
    }
}
