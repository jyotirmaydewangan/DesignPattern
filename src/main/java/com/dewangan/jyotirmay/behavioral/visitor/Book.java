package com.dewangan.jyotirmay.behavioral.visitor;

/**
 * Created by jyotirmay.d on 02/10/17.
 */
public class Book implements ItemElement {

    private int price;
    private String isbnNumber;

    public Book(int cost, String isbn){
        this.price=cost;
        this.isbnNumber=isbn;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }


    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}
