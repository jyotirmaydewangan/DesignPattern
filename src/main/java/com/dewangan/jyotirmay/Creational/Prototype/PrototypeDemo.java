package com.dewangan.jyotirmay.Creational.Prototype;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class PrototypeDemo {

    public static void main(String[] arg){
        Sheep sh = new Sheep("Jolly", "Mountain Sheep");
        sh.printSheep();

        System.out.println("Hash Code of first sheep = " + sh.hashCode());

        sh = (Sheep)sh.clone();
        sh.setName("Dolly");
        sh.printSheep();
        System.out.println("Hash Code of Cloned sheep = " + sh.hashCode());
    }
}
