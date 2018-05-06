package com.sunshuai.daggerdemo.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.sunshuai.daggerdemo.R;
import com.sunshuai.daggerdemo.bean.Money;
import com.sunshuai.daggerdemo.bean.User;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class LoginActivity extends AppCompatActivity {


    @Inject
    User user; //全局实例，由AppModule提供
    @Inject
    Money money; //局部实例，由LoginModule提供

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        AndroidInjection.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        user.setName("孙帅");
        user.setAge(22);
        money.setYuan(10000);
        ((TextView)findViewById(R.id.tv)).setText(user.getName()+","+user.getAge()+";"+money.getYuan()+","+money.getJiao()+","+money.getFen());
    }
}
