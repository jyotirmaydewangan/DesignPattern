package com.dewangan.jyotirmay.behavioral.state;

/**
 * Created by jyotirmay.d on 03/10/17.
 */
public class LowerCase implements WritingState {
    public void write(String word) {
        System.out.println(word.toLowerCase());
    }
}
