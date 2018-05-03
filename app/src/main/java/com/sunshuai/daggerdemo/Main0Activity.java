package com.sunshuai.daggerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.sunshuai.daggerdemo.daggercomponent.AppComponent;
import com.sunshuai.daggerdemo.daggercomponent.DaggerAct0Component;
import com.sunshuai.daggerdemo.daggercomponent.DaggerAppComponent;
import com.sunshuai.daggerdemo.daggermodule.AppModule;
import com.sunshuai.daggerdemo.model.ShoppingCart;
import com.sunshuai.daggerdemo.model.User;

import javax.inject.Inject;

public class Main0Activity extends AppCompatActivity {

    // TODO: 2018/5/3 dagger android
    @Inject
    User user;
    @Inject
    ShoppingCart shoppingCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);


        AppComponent appComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule())
                .build();

        DaggerAct0Component
                .builder()
                .appComponent(appComponent)
                .build()
                .inject(this);

        ((TextView) findViewById(R.id.tv0)).setText(user.getUsername() + "," + user.getAge() + "," + shoppingCart.getCardId() + "," + shoppingCart.getCardName());

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main0Activity.this, Main1Activity.class);
                startActivity(intent);
            }
        });

    }
}
