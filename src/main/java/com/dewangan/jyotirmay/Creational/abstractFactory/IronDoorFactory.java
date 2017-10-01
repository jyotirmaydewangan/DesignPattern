package com.dewangan.jyotirmay.Creational.abstractFactory;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class IronDoorFactory implements DoorFactory {
    public Door makeDoor() {
        return new IronDoor();
    }

    public DoorFittingExpert makeDoorFittingExpert() {
        return new Welder();
    }
}
