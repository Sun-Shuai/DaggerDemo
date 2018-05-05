package com.sunshuai.daggerdemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.sunshuai.daggerdemo.R;
import com.sunshuai.daggerdemo.daggercomponent.AppComponent;
import com.sunshuai.daggerdemo.daggercomponent.DaggerAppComponent;
import com.sunshuai.daggerdemo.daggermodule.AppModule;
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

    }
}
