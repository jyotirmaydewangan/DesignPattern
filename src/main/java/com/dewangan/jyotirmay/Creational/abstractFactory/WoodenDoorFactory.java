package com.dewangan.jyotirmay.Creational.abstractFactory;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class WoodenDoorFactory implements DoorFactory {
    public Door makeDoor() {
        return new WoodenDoor();
    }

    public DoorFittingExpert makeDoorFittingExpert() {
        return new Carpenter();
    }
}
