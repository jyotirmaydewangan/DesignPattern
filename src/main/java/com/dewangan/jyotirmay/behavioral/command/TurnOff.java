package com.dewangan.jyotirmay.behavioral.command;

/**
 * Created by jyotirmay.d on 01/10/17.
 */
public class TurnOff implements Command {
    private Bulb bulb;

    public TurnOff(Bulb bulb){
        this.bulb = bulb;
    }

    public void execute() {
        bulb.turnOff();
    }

    public void undo() {
        bulb.turnOn();
    }

    public void redo() {
        this.execute();
    }
}
