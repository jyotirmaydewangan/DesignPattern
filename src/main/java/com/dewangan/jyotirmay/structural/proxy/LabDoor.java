package com.dewangan.jyotirmay.structural.proxy;

/**
 * Created by jyotirmay.d on 01/10/17.
 */
public class LabDoor implements Door {
    public void open() {
        System.out.println("Opening Lab Door");
    }

    public void close() {
        System.out.println("Closing Lab Door");
    }
}
