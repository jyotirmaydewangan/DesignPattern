package com.dewangan.jyotirmay.behavioral.strategy;

/**
 * Created by jyotirmay.d on 03/10/17.
 */
public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
        this.name=nm;
        this.cardNumber=ccNum;
        this.cvv=cvv;
        this.dateOfExpiry=expiryDate;
    }

    public void pay(int amount) {
        System.out.println(amount +" paid with credit/debit card");
    }

}
