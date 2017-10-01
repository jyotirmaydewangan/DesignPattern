package com.dewangan.jyotirmay.creational.abstractFactory;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class Welder implements DoorFittingExpert {

    public void getDescription() {
        System.out.println("I am Welder. I can only fit iron doors");
    }
}
