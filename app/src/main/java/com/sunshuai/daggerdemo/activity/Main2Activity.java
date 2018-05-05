package com.sunshuai.daggerdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.sunshuai.daggerdemo.R;
import com.sunshuai.daggerdemo.daggercomponent.AppComponent;
import com.sunshuai.daggerdemo.daggercomponent.DaggerAppComponent;
import com.sunshuai.daggerdemo.daggermodule.Act2Module;
import com.sunshuai.daggerdemo.model.Book;
import com.sunshuai.daggerdemo.model.User;

import javax.inject.Inject;

public class Main2Activity extends AppCompatActivity {

    @Inject
    User user;
    @Inject
    Book book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        AppComponent appComponent = DaggerAppComponent.create();

        appComponent
                .mainBuilder()
                .act2Module(new Act2Module(100))
                .build()
                .inject(this);


        ((TextView) findViewById(R.id.tv2)).setText(user.getUsername()+","+user.getAge()+","+book.getName());


    }
}
