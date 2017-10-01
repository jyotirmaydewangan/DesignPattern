package com.dewangan.jyotirmay.structural.facade;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class FacadeDemo {

    public static void main(String[] arg){
        ComputerFacade computerFacade = new ComputerFacade(new Computer());
        System.out.println("*************************");
        computerFacade.turnOn();
        System.out.println("*************************");
        computerFacade.turnOff();
        System.out.println("*************************");
    }

}
