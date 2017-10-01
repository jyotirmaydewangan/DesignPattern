package com.dewangan.jyotirmay.Structural.Facade;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class ComputerFacade {
    private Computer computer;

    public ComputerFacade(Computer computer){
        this.computer = computer;
    }

    public void turnOn(){
        computer.getElectricShock();
        computer.makeSound();
        computer.showLoadingScreen();
        computer.bam();
    }

    public  void  turnOff(){
        computer.closeEverything();
        computer.pullCurrent();
        computer.sooth();
    }
}
