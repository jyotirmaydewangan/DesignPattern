package com.dewangan.jyotirmay.factoryMethod;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public abstract class HiringManager {
    public abstract Interviewer makeInterviewer();

    public  void takeInterview(){
        Interviewer interviewer = makeInterviewer();
        interviewer.askQuestions();
    }
}
