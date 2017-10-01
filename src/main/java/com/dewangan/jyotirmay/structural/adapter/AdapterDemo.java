package com.dewangan.jyotirmay.structural.adapter;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class AdapterDemo {
    public static void main(String[] arg){
        Lion lion = new AfricanLion();
        lion.roar();

        lion = new AsianLion();
        lion.roar();

        lion = new WildDogAdapter(new WildDog());
        lion.roar();
    }
}
