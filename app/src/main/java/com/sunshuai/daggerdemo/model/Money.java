package com.sunshuai.daggerdemo.model;

import java.io.Serializable;

/**
 * Created by sunshuai on 2018/5/3
 */
public class Money implements Serializable {
    private int yuan;
    private int jiao;
    private int fen;

    public int getYuan() {
        return yuan;
    }

    public void setYuan(int yuan) {
        this.yuan = yuan;
    }

    public int getJiao() {
        return jiao;
    }

    public void setJiao(int jiao) {
        this.jiao = jiao;
    }

    public int getFen() {
        return fen;
    }

    public void setFen(int fen) {
        this.fen = fen;
    }
}
