package com.dewangan.jyotirmay.structural.flyweight;

/**
 * Created by jyotirmay.d on 01/10/17.
 */
public class KarakTea {
    private String name;

    public KarakTea(String name){
        this.name = name;
    }

    public String teaName(){
        //System.out.println("Tea name is " + this.name);
        return this.name;
    }
}
