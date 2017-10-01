package com.dewangan.jyotirmay.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jyotirmay.d on 01/10/17.
 */
public class TeaShop {
    private TeaMaker teaMaker;
    private Map<Integer, KarakTea> order;

    public TeaShop(){
        teaMaker = new TeaMaker();
        order = new HashMap<Integer, KarakTea>();
    }

    public void takeOrder(String teaName, Integer tableNo){
        order.put(tableNo, teaMaker.makeTea(teaName));
    }

    public void serveTea(){
        for(Integer tableNo : order.keySet()){
            System.out.println("Table No - " + tableNo + ", Tea Name - " + order.get(tableNo).teaName());
        }
    }
}
