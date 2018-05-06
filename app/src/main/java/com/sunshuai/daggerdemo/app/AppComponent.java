package com.sunshuai.daggerdemo.app;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by sunshuai on 2018/5/6
 */
@Component(modules = {AndroidInjectionModule.class, AppModule.class})
public interface AppComponent {
    void inject(MyApplication application);
}
