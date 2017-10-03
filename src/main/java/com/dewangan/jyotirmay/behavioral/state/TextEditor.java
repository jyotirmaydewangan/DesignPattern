package com.dewangan.jyotirmay.behavioral.state;

/**
 * Created by jyotirmay.d on 03/10/17.
 */
public class TextEditor {
    private WritingState state;

    public TextEditor(WritingState state){
        this.state = state;
    }

    public void setState(WritingState state){
        this.state = state;
    }

    public void type(String word){
        state.write(word);
    }
}
