package com.dewangan.jyotirmay.behavioral.command;

/**
 * Created by jyotirmay.d on 01/10/17.
 */
public class CommandDemo {
    public static void main(String[] arg){
        Bulb bulb = new Bulb();
        TurnOn turnOn = new TurnOn(bulb);
        TurnOff turnOff = new TurnOff(bulb);

        RemoteControl rc = new RemoteControl();
        rc.submit(turnOn);
        rc.submit(turnOff);
    }
}
