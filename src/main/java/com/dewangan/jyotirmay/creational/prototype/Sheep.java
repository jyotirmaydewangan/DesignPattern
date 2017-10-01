package com.dewangan.jyotirmay.creational.prototype;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class Sheep implements Cloneable {
    private String name;
    private String category;

    public Sheep(String name, String category){
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public void printSheep(){
        System.out.println("Name = " + this.name + ", Category = " + this.category);
    }

    public Object clone(){
        return new Sheep(this.name, this.category);
    }

}
