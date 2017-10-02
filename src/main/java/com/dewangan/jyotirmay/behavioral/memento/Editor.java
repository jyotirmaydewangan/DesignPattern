package com.dewangan.jyotirmay.behavioral.memento;

/**
 * Created by jyotirmay.d on 02/10/17.
 */
public class Editor {
    private String content = "";

    public void type(String word){
        this.content = this.content + " " + word;
    }

    public String getContent(){
        return this.content;
    }

    public EditorMemento save(){
        return new EditorMemento(this.content);
    }

    public void restore(EditorMemento editorMemento){
        this.content = editorMemento.getContent();
    }
}
