package com.dewangan.jyotirmay.creational.singleton;

import java.io.Serializable;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class President implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    private static President instance;

    private President(){

    }

    public static President getInstance(){

        if(instance == null){
            synchronized (President.class) {
                if(instance == null) {
                    instance = new President();
                }
            }
        }

        return instance;
    }

    public Object clone(){
        return getInstance();
    }

    public Object readResolve(){
        return getInstance();
    }
}
