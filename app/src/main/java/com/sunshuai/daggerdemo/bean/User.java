package com.sunshuai.daggerdemo.bean;

import java.io.Serializable;

/**
 * Created by sunshuai on 2018/5/6
 */
public class User implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
