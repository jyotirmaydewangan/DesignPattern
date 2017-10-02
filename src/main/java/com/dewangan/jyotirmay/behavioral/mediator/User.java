package com.dewangan.jyotirmay.behavioral.mediator;

/**
 * Created by jyotirmay.d on 02/10/17.
 */
public class User {
    private String name;
    private ChatRoomMediator mediator;

    public User(String name, ChatRoomMediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    public String getName(){
        return this.name;
    }

    public void sendMessages(String msg){
        mediator.showMessages(this, msg);
    }
}
