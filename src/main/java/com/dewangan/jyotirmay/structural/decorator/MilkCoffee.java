package com.dewangan.jyotirmay.structural.decorator;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class MilkCoffee implements Coffee {

    private Coffee coffee;

    public MilkCoffee(Coffee coffee){
        this.coffee = coffee;
    }

    public int getCost() {
        return coffee.getCost() + 2;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }
}
