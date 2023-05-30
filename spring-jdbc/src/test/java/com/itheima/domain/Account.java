package com.itheima.domain;

/**
 * @author lance huang
 * @create 2023-05-07-17:39
 */
public class Account {
    String name;
    double money;

    public Account() {
    }

    public Account(String name, double money) {
        this.name = name;
        this.money = money;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return money
     */
    public double getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }

    public String toString() {
        return "Account{name = " + name + ", money = " + money + "}";
    }
}
