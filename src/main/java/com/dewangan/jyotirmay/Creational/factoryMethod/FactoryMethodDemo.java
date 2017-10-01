package com.dewangan.jyotirmay.Creational.factoryMethod;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class FactoryMethodDemo {
    public static void main(String[] arg){
        HiringManager hm1 = new DevelopmentManager();
        hm1.takeInterview();

        HiringManager hm2 = new MarketingManager();
        hm2.takeInterview();
    }
}
