package com.dewangan.jyotirmay.behavioral.chainOfResponsibility;

/**
 * Created by jyotirmay.d on 01/10/17.
 */
public class ChainOfResponsibilityDemo {
    public static void main(String[] arg) {

        Account bank = new Bank(100);
        Account paypal = new Paypal(200);
        Account bitcoin = new Bitcoin(300);

        bank.setNext(paypal);
        paypal.setNext(bitcoin);

        try {
            bank.pay(300);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
