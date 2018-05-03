package com.sunshuai.daggerdemo.daggermodule;

import com.sunshuai.daggerdemo.model.ShoppingCart;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sunshuai on 2018/5/3
 */
@Module
public class Act0Module {
    @Provides
    ShoppingCart provideCartModel() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setCardId(1);
        shoppingCart.setCardName("我的购物卡");
        return shoppingCart;
    }
}
