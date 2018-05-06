package com.sunshuai.daggerdemo.login;


import com.sunshuai.daggerdemo.bean.Money;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sunshuai on 2018/5/6
 */
@Module
public class LoginModule {
    @Provides
    Money provideMoney() {
        return new Money();
    }
}
