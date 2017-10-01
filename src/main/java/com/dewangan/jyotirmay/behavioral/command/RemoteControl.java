package com.dewangan.jyotirmay.behavioral.command;

/**
 * Created by jyotirmay.d on 01/10/17.
 */
public class RemoteControl {
    public void submit(Command cmd){
        cmd.execute();
    }
}
