package com.dewangan.jyotirmay.behavioral.observer;

/**
 * Created by jyotirmay.d on 02/10/17.
 */
public interface Observer {

    //method to update the observer, used by subject
    public void update();

    //attach with subject to observe
    public void setSubject(Subject sub);
}