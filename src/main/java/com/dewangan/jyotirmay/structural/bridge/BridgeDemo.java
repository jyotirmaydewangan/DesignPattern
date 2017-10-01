package com.dewangan.jyotirmay.structural.bridge;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class BridgeDemo {
    public static void main(String[] arg){
        WebPage aboutPage = new About(new DarkTheme());
        WebPage careers = new Careers(new DarkTheme());
        aboutPage.getContent();
        careers.getContent();

        aboutPage = new About(new LightTheme());
        careers = new Careers(new LightTheme());
        aboutPage.getContent();
        careers.getContent();

        aboutPage = new About(new AquaTheme());
        careers = new Careers(new AquaTheme());
        aboutPage.getContent();
        careers.getContent();
    }
}
