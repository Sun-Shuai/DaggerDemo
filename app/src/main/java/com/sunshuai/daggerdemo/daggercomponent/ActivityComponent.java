package com.sunshuai.daggerdemo.daggercomponent;

import com.sunshuai.daggerdemo.daggermodule.ActivityModule;
import com.sunshuai.daggerdemo.model.User;

import dagger.Component;

/**
 * Created by sunshuai on 2018/5/3
 */
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    User uer();
}
