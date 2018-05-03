package com.sunshuai.daggerdemo.model;

import java.io.Serializable;

/**
 * Created by sunshuai on 2018/5/3
 */
public class ShoppingCart implements Serializable {
    private int cardId;
    private String cardName;

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
}
