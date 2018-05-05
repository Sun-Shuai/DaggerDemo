package com.sunshuai.daggerdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.sunshuai.daggerdemo.R;
import com.sunshuai.daggerdemo.daggercomponent.DaggerAppComponent;
import com.sunshuai.daggerdemo.model.Money;
import com.sunshuai.daggerdemo.model.User;

import javax.inject.Inject;

public class Main1Activity extends AppCompatActivity {

    @Inject
    User user;
    @Inject
    Money money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        //写法1
//        DaggerAppComponent
//                .builder()
//                .appModule(new AppModule())
//                .build()
//                .act1component()
//                .inject(this);


        //写法2
        DaggerAppComponent.create()
                .act1component()
                .inject(this);

        ((TextView) findViewById(R.id.tv1)).setText(user.getUsername() + "," + user.getAge() + "," + money.getYuan() + "," + money.getJiao() + "," + money.getFen());

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main1Activity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

    }
}
