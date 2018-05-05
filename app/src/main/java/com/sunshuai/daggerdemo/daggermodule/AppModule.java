package com.sunshuai.daggerdemo.daggermodule;

import com.sunshuai.daggerdemo.model.User;



import dagger.Module;
import dagger.Provides;

/**
 * Created by sunshuai on 2018/5/3
 */
@Module
public class AppModule {
    @Provides
    User provideUser() {
        User user = new User();
        user.setUsername("孙帅");
        user.setAge(23);
        return user;
    }
}
