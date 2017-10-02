package com.dewangan.jyotirmay.behavioral.memento;

/**
 * Created by jyotirmay.d on 02/10/17.
 */
public class MementoDemo {
    public static void main(String[] arg) {
        Editor editor = new Editor();
        editor.type("This is the first sentence.");
        editor.type("This is second.");

        EditorMemento save = editor.save();

        editor.type("And this is third.");

        System.out.println(editor.getContent());

        editor.restore(save);

        System.out.println(editor.getContent());

    }


}
