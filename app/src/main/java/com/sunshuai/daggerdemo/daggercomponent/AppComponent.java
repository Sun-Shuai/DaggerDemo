package com.sunshuai.daggerdemo.daggercomponent;

import com.sunshuai.daggerdemo.MainActivity;
import com.sunshuai.daggerdemo.daggermodule.AppModule;
import com.sunshuai.daggerdemo.model.User;

import dagger.Component;

/**
 * Created by sunshuai on 2018/5/3
 */
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(MainActivity activity);

    User uer();

    Act1Component act1component();
}
