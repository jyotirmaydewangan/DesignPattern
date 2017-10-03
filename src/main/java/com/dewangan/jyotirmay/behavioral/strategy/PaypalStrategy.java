package com.dewangan.jyotirmay.behavioral.strategy;

/**
 * Created by jyotirmay.d on 03/10/17.
 */
public class PaypalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public PaypalStrategy(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }

    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }

}
