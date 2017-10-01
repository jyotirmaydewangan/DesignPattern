package com.dewangan.jyotirmay.Creational.factoryMethod;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class MarketingManager extends HiringManager {
    public Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }
}
