package com.dewangan.jyotirmay.behavioral.memento;

/**
 * Created by jyotirmay.d on 02/10/17.
 */
public class EditorMemento {
    private String content;

    public EditorMemento(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }
}
