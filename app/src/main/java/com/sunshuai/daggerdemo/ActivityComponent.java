package com.sunshuai.daggerdemo;

import dagger.Component;

/**
 * Created by sunshuai on 2018/5/3
 */
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
}
