package com.dewangan.jyotirmay.creational.singleton;

import java.io.*;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class SingletonDemo {

    public static void main(String[] arg) throws IOException, ClassNotFoundException {
        President president = President.getInstance();
        System.out.println("Before Clone Hash Code      = " + president.hashCode());

        president = (President) president.clone();
        System.out.println("After Clone  Hash Code      = " + president.hashCode());


        System.out.println("Before Seiarlize  Hash Code = " + president.hashCode());
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("out.txt"));
        out.writeObject(president);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("out.txt"));
        President President2 = (President)in.readObject();
        in.close();
        System.out.println("After Deseiarlize Hash Code = " + president.hashCode());
    }
}
