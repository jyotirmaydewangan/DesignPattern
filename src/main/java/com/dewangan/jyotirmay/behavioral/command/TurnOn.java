package com.dewangan.jyotirmay.behavioral.command;

/**
 * Created by jyotirmay.d on 01/10/17.
 */
public class TurnOn implements Command {
    private Bulb bulb;

    public TurnOn(Bulb bulb){
        this.bulb = bulb;
    }

    public void execute() {
        bulb.turnOn();
    }

    public void undo() {
        bulb.turnOff();
    }

    public void redo() {
        this.execute();
    }
}
