package com.dewangan.jyotirmay.behavioral.Template;

/**
 * Created by jyotirmay.d on 03/10/17.
 */
public class TemplateDemo {
    public static void main(String[] arg){

        Builder androidBuilder = new AndroidBuilder();
        Builder iosBuilder = new IosBuilder();
        System.out.println("************************************");
        androidBuilder.build();
        System.out.println("************************************");
        iosBuilder.build();
        System.out.println("************************************");

    }
}
