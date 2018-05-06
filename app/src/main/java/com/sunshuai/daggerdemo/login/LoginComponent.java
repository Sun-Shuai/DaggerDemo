package com.sunshuai.daggerdemo.login;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by sunshuai on 2018/5/6
 */
@Subcomponent(modules = LoginModule.class)
public interface LoginComponent extends AndroidInjector<LoginActivity> {

    void inject(LoginActivity loginActivity);

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LoginActivity> {

    }
}
