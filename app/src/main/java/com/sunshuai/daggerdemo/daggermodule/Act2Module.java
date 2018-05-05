package com.sunshuai.daggerdemo.daggermodule;

import com.sunshuai.daggerdemo.model.Book;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sunshuai on 2018/5/5
 */
@Module
public class Act2Module {
    private int cacheSize;

    public Act2Module(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    @Singleton
    @Provides
    Book provideBook() {
        Book book = new Book();
        book.setName("Java编程思想" + cacheSize);
        return book;
    }
}
