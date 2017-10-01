package com.dewangan.jyotirmay.Creational.simpleFactory;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class WoodenDoor implements Door {
    private int height;
    private int weight;

    public WoodenDoor(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
