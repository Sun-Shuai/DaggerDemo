package com.sunshuai.daggerdemo.app;

import android.app.Activity;


import com.sunshuai.daggerdemo.bean.User;
import com.sunshuai.daggerdemo.login.LoginActivity;
import com.sunshuai.daggerdemo.login.LoginComponent;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by sunshuai on 2018/5/6
 */
@Module(subcomponents = LoginComponent.class)
public abstract class AppModule {
    @Provides
    static User provideUser() {
        return new User();
    }

    @Binds
    @IntoMap
    @ActivityKey(LoginActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindFactory(LoginComponent.Builder builder);

}
