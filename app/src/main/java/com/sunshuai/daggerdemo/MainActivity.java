package com.sunshuai.daggerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private ActivityComponent activityComponent;
    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityComponent = DaggerActivityComponent.builder().activityModule(new ActivityModule()).build();
        activityComponent.inject(this);
        ((TextView) findViewById(R.id.tv1)).setText(user.getUsername() + user.getAge());
    }
}
