package com.sunshuai.daggerdemo.daggercomponent;

import com.sunshuai.daggerdemo.activity.Main2Activity;
import com.sunshuai.daggerdemo.daggermodule.Act2Module;

import javax.inject.Singleton;

import dagger.Subcomponent;

/**
 * Created by sunshuai on 2018/5/5
 */
@Singleton
@Subcomponent(modules = Act2Module.class)
public interface Act2Component {
    void inject(Main2Activity activity);

    @Subcomponent.Builder
    interface MainBuilder{
        MainBuilder act2Module(Act2Module module); //传入参数
        Act2Component build();
    }
}
