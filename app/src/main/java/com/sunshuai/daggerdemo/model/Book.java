package com.sunshuai.daggerdemo.model;

import java.io.Serializable;

/**
 * Created by sunshuai on 2018/5/5
 */
public class Book implements Serializable {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
