package com.sunshuai.daggerdemo.daggermodule;

import com.sunshuai.daggerdemo.model.ShoppingCart;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sunshuai on 2018/5/3
 */
@Module
public class ContainerModule {
    @Provides
    ShoppingCart provideCartModel() {
        return new ShoppingCart();
    }
}
