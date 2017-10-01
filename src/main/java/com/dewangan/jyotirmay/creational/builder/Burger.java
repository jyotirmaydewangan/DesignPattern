package com.dewangan.jyotirmay.creational.builder;

/**
 * Created by jyotirmay.d on 30/09/17.
 */

public class Burger {
    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean lettuce;
    private boolean tomato;

    public Burger(BurgerBuilder burgerBuilder){
        this.size = burgerBuilder.getSize();
        this.cheese = burgerBuilder.isCheese();
        this.pepperoni = burgerBuilder.isPepperoni();
        this.lettuce = burgerBuilder.isLettuce();
        this.tomato = burgerBuilder.isTomato();
    }

    public void displayBurger(){
        System.out.println("***************************");
        System.out.println("Size      = " + size);
        System.out.println("Cheese    = " + cheese);
        System.out.println("Pepperoni = " + pepperoni);
        System.out.println("Lettuce   = " + lettuce);
        System.out.println("Tomato    = " + tomato);
        System.out.println("***************************");
    }
}
