package com.dewangan.jyotirmay.structural.decorator;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class DecoratorDemo {
    public static void main(String[] arg){
        Coffee coffee = new SimpleCoffee();
        System.out.println("Coffee Cost = " + coffee.getCost());
        System.out.println(coffee.getDescription());
        System.out.println();

        coffee = new MilkCoffee(coffee);
        System.out.println("Coffee Cost = " + coffee.getCost());
        System.out.println(coffee.getDescription());
        System.out.println();

        coffee = new WhipCoffee(coffee);
        System.out.println("Coffee Cost = " + coffee.getCost());
        System.out.println(coffee.getDescription());
        System.out.println();

        coffee = new VanillaCoffee(coffee);
        System.out.println("Coffee Cost = " + coffee.getCost());
        System.out.println(coffee.getDescription());
        System.out.println();
    }
}
