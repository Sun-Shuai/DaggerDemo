package com.sunshuai.daggerdemo.daggercomponent;

import com.sunshuai.daggerdemo.Main0Activity;
import com.sunshuai.daggerdemo.daggermodule.Act0Module;

import dagger.Component;

/**
 * Created by sunshuai on 2018/5/3
 */
@Component(dependencies = AppComponent.class, modules = Act0Module.class)
public interface Act0Component {
    void inject(Main0Activity activity);
}
