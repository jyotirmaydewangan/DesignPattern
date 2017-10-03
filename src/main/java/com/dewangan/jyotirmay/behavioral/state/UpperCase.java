package com.dewangan.jyotirmay.behavioral.state;

/**
 * Created by jyotirmay.d on 03/10/17.
 */
public class UpperCase implements WritingState{
    public void write(String word) {
        System.out.println(word.toUpperCase());
    }
}
