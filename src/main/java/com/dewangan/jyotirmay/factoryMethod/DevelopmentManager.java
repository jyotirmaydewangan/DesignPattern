package com.dewangan.jyotirmay.factoryMethod;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class DevelopmentManager extends HiringManager {
    public Interviewer makeInterviewer() {
        return new Developer();
    }
}
