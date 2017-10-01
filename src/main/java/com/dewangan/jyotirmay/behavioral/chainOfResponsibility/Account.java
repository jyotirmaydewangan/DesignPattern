package com.dewangan.jyotirmay.behavioral.chainOfResponsibility;

/**
 * Created by jyotirmay.d on 01/10/17.
 */
public class Account {
    protected int balance;
    protected Account next;

    public void setNext(Account next){
        this.next = next;
    }

    public void pay(int amount) throws Exception {
        if(canPay(amount)){
            System.out.println("Paid " + amount + " using " + this.getClass().getSimpleName());
            this.balance = this.balance - amount;
            System.out.println("Remaining " + this.balance + " in " + this.getClass().getSimpleName());
        } else if(next != null){
            System.out.println("Can not Pay using " + this.getClass().getSimpleName());
            next.pay(amount);
        } else {
            throw new Exception("None of the accounts have enough balance");
        }
    }

    private boolean canPay(int amount){
        return this.balance >= amount;
    }
}
