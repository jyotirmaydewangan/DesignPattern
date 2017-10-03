package com.dewangan.jyotirmay.behavioral.state;

/**
 * Created by jyotirmay.d on 03/10/17.
 */
public class StateDemo {
    public static void main(String[] arg) {

        TextEditor textEditor = new TextEditor(new DefaultCase());

        textEditor.type("First Line");

        textEditor.setState(new LowerCase());

        textEditor.type("Second Line");

        textEditor.setState(new UpperCase());

        textEditor.type("Third Line");
    }
}
