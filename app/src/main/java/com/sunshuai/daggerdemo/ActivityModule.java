package com.sunshuai.daggerdemo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sunshuai on 2018/5/3
 */
@Module
public class ActivityModule {
    @Provides User provideUser(){
        return new User();
    }
}
