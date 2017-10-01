package com.dewangan.jyotirmay.Structural.Decorator;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class WhipCoffee implements Coffee {

    private Coffee coffee;

    public WhipCoffee(Coffee coffee){
        this.coffee = coffee;
    }

    public int getCost() {
        return coffee.getCost() + 5;
    }

    public String getDescription() {
        return coffee.getDescription() + ", whip";
    }
}
