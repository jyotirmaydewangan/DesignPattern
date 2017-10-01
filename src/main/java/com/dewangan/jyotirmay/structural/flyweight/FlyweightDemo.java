package com.dewangan.jyotirmay.structural.flyweight;

/**
 * Created by jyotirmay.d on 01/10/17.
 */
public class FlyweightDemo {
    public static void main(String[] arg){
        TeaShop teaShop = new TeaShop();

        teaShop.takeOrder("less sugar", 1);
        teaShop.takeOrder("more milk", 2);
        teaShop.takeOrder("without sugar", 5);

        teaShop.serveTea();
    }
}
