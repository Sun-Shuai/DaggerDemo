package com.sunshuai.daggerdemo.daggermodule;

import com.sunshuai.daggerdemo.model.Money;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sunshuai on 2018/5/3
 */
@Module
public class Act1Module {
    @Provides
    Money provideMoney() {
        return new Money();
    }
}
