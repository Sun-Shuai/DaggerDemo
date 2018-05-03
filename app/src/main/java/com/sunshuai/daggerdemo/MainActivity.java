package com.sunshuai.daggerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.sunshuai.daggerdemo.daggercomponent.ActivityComponent;
import com.sunshuai.daggerdemo.daggercomponent.ContainerComponent;
import com.sunshuai.daggerdemo.daggercomponent.DaggerActivityComponent;
import com.sunshuai.daggerdemo.daggercomponent.DaggerContainerComponent;
import com.sunshuai.daggerdemo.daggermodule.ActivityModule;
import com.sunshuai.daggerdemo.daggermodule.ContainerModule;
import com.sunshuai.daggerdemo.model.ShoppingCart;
import com.sunshuai.daggerdemo.model.User;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    User user;
    @Inject
    ShoppingCart shoppingCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent activityComponent = DaggerActivityComponent.builder().activityModule(new ActivityModule()).build();
        ContainerComponent containerComponent = DaggerContainerComponent.builder().activityComponent(activityComponent).containerModule(new ContainerModule()).build();
        containerComponent.inject(this);
        ((TextView) findViewById(R.id.tv1)).setText(user.getUsername() + user.getAge());
    }
}
