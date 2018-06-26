package com.ling.rabbitmq.entity;

import java.io.Serializable;

/**
 * @description: user
 * @author: linguande
 * @create: 2018-06-26 11:39
 **/
public class User implements Serializable {

    private String name;

    private String password;

    public User(){

    }

    public User(String name,String password){
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

