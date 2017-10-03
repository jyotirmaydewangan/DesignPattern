package com.dewangan.jyotirmay.behavioral.visitor;

/**
 * Created by jyotirmay.d on 02/10/17.
 */
public class Fruit implements ItemElement {

    private int pricePerKg;
    private int weight;
    private String name;

    public Fruit(int priceKg, int wt, String nm){
        this.pricePerKg=priceKg;
        this.weight=wt;
        this.name = nm;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }


    public int getWeight() {
        return weight;
    }

    public String getName(){
        return this.name;
    }


    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}