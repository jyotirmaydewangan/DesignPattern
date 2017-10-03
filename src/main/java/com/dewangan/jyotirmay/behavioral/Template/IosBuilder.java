package com.dewangan.jyotirmay.behavioral.Template;

/**
 * Created by jyotirmay.d on 03/10/17.
 */
public class IosBuilder extends Builder {

    public void test() {
        System.out.println("Running Ios tests");
    }

    public void lint() {
        System.out.println("Linting the Ios code");
    }

    public void assemble() {
        System.out.println("Assembling the Ios build");
    }

    public void deploy() {
        System.out.println("Deploying Ios build to server");
    }
}
