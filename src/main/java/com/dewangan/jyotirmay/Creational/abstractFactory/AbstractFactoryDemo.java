package com.dewangan.jyotirmay.Creational.abstractFactory;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class AbstractFactoryDemo {
    public static void main(String[] arg){
        DoorFactory doorFactory = new WoodenDoorFactory();
        doorFactory.makeDoor().getDescription();
        doorFactory.makeDoorFittingExpert().getDescription();

        doorFactory = new IronDoorFactory();
        doorFactory.makeDoor().getDescription();
        doorFactory.makeDoorFittingExpert().getDescription();
    }
}
