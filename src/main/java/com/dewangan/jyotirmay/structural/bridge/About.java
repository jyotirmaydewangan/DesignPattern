package com.dewangan.jyotirmay.structural.bridge;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class About implements WebPage {
    private Theme theam;

    public About(Theme theme){
        this.theam = theme;
    }

    public void getContent() {
        System.out.println("About page in " + theam.getColor());
    }
}
