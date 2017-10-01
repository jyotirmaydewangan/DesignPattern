package com.dewangan.jyotirmay.behavioral.chainOfResponsibility;

/**
 * Created by jyotirmay.d on 01/10/17.
 */
public class Paypal extends Account {
    public Paypal(int amount){
        this.balance = amount;
    }
}
