package com.dewangan.jyotirmay.Structural.Adapter;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class WildDogAdapter implements Lion {
    private Dog dog;

    public WildDogAdapter(Dog dog){
        this.dog = dog;
    }

    public void roar() {
        dog.bark();
    }
}
