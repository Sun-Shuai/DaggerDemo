package com.sunshuai.daggerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.sunshuai.daggerdemo.daggercomponent.DaggerAppComponent;
import com.sunshuai.daggerdemo.model.User;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerAppComponent.create().inject(this);

        ((TextView) findViewById(R.id.tv)).setText(user.getUsername() + "," + user.getAge());

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main0Activity.class);
                startActivity(intent);
            }
        });
    }
}
