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
        Money money = new Money();
        money.setYuan(10000);
        money.setJiao(5);
        money.setFen(0);
        return money;
    }
}
