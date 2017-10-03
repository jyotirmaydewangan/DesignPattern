package com.dewangan.jyotirmay.behavioral.strategy;

/**
 * Created by jyotirmay.d on 03/10/17.
 */
public class Item {

    private String upcCode;
    private int price;

    public Item(String upc, int cost){
        this.upcCode=upc;
        this.price=cost;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }

}
