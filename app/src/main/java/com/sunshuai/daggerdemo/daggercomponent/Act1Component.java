package com.sunshuai.daggerdemo.daggercomponent;

import com.sunshuai.daggerdemo.Main1Activity;
import com.sunshuai.daggerdemo.daggermodule.Act1Module;

import dagger.Subcomponent;

/**
 * Created by sunshuai on 2018/5/3
 */
@Subcomponent(modules = Act1Module.class)
public interface Act1Component {
    void inject(Main1Activity activity);
}
