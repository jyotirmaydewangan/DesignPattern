package com.dewangan.jyotirmay.creational.simpleFactory;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class DoorFactory {

    public static Door makeDoor(int height, int weight){
        return new WoodenDoor(height, weight);
    }
}
