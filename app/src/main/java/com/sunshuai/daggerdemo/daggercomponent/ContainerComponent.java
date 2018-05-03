package com.sunshuai.daggerdemo.daggercomponent;

import com.sunshuai.daggerdemo.MainActivity;
import com.sunshuai.daggerdemo.daggermodule.ContainerModule;

import dagger.Component;

/**
 * Created by sunshuai on 2018/5/3
 */
@Component(dependencies = ActivityComponent.class, modules = ContainerModule.class)
public interface ContainerComponent {
    void inject(MainActivity activity);
}
