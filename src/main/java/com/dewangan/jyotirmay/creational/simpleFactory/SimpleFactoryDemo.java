package com.dewangan.jyotirmay.creational.simpleFactory;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class SimpleFactoryDemo {
    public static void main(String[] arg){

        Door door = DoorFactory.makeDoor(12, 4);

        System.out.println("Door height = " + door.getHeight());
        System.out.println("Door weight = " + door.getWeight());
    }
}
