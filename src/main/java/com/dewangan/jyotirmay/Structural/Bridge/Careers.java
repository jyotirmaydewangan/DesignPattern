package com.dewangan.jyotirmay.Structural.Bridge;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class Careers implements WebPage {
    private Theme theme;

    public Careers(Theme theme){
        this.theme = theme;
    }
    public void getContent() {
        System.out.println("Careers page in " + theme.getColor());
    }
}
