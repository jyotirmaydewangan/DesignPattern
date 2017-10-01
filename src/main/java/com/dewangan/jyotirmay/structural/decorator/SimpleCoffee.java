package com.dewangan.jyotirmay.structural.decorator;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class SimpleCoffee implements Coffee {
    int cost;

    public SimpleCoffee(){
        this.cost = 10;
    }

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return "Simple coffee";
    }
}
