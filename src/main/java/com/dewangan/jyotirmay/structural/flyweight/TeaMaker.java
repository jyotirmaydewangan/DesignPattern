package com.dewangan.jyotirmay.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jyotirmay.d on 01/10/17.
 */
public class TeaMaker {
    private Map<String, KarakTea> hm;

    public TeaMaker(){
        hm = new HashMap<String, KarakTea>();
    }

    public KarakTea makeTea(String name){
        KarakTea tempTea = hm.get(name);

        if(tempTea == null){
            tempTea = new KarakTea(name);
            hm.put(name, tempTea);
        }

        return tempTea;
    }
}

