package com.dewangan.jyotirmay.Creational.Builder;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class BurgerBuilder {

    private String size;
    private boolean cheese = false;
    private boolean pepperoni = false;
    private boolean lettuce = false;
    private boolean tomato = false;

    public BurgerBuilder(String size){
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public BurgerBuilder setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public BurgerBuilder setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
        return this;
    }

    public boolean isTomato() {
        return tomato;
    }

    public BurgerBuilder setTomato(boolean tomato) {
        this.tomato = tomato;
        return this;
    }

    public boolean isCheese() {
        return cheese;
    }

    public BurgerBuilder setCheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    public Burger build(){
        return new Burger(this);
    }

}
