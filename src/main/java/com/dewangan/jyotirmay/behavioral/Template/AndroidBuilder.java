package com.dewangan.jyotirmay.behavioral.Template;

/**
 * Created by jyotirmay.d on 03/10/17.
 */


public class AndroidBuilder extends Builder {

    public void test() {
        System.out.println("Running android tests");
    }

    public void lint() {
        System.out.println("Linting the android code");
    }

    public void assemble() {
        System.out.println("Assembling the android build");
    }

    public void deploy() {
        System.out.println("Deploying android build to server");
    }
}
