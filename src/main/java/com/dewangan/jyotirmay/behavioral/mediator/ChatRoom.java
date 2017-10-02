package com.dewangan.jyotirmay.behavioral.mediator;

import java.util.Date;

/**
 * Created by jyotirmay.d on 02/10/17.
 */
public class ChatRoom implements ChatRoomMediator {
    public void showMessages(User user, String msg) {
        Date date = new Date();
        System.out.println("[" + date.toString() + "]"+ " User: " + user.getName() + " Messages: " + msg);
    }
}
