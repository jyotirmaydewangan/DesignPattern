package com.dewangan.jyotirmay.Creational.Builder;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class BurgerDemo {

    public static void main(String[] arg){
        Burger burger = new BurgerBuilder("Small")
                               .setCheese(true)
                               .setLettuce(true)
                               .build();

        burger.displayBurger();
    }
}
