package com.dewangan.jyotirmay.structural.proxy;

/**
 * Created by jyotirmay.d on 01/10/17.
 */
public class ProxyDemo {
    public static void main(String[] arg){
        Security door = new Security();

        door.open();
        door.open("invalid");
        door.open("passwd");

        door.close();
    }
}
