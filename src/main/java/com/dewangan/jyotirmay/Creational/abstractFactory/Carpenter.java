package com.dewangan.jyotirmay.Creational.abstractFactory;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class Carpenter implements DoorFittingExpert {
    public void getDescription() {
        System.out.println("I am Carpenter. I can only fit wooden door");
    }
}
