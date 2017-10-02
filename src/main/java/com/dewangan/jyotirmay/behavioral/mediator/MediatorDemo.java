package com.dewangan.jyotirmay.behavioral.mediator;

/**
 * Created by jyotirmay.d on 02/10/17.
 */
public class MediatorDemo {
    public static void main(String[] arg) throws InterruptedException {
        ChatRoomMediator mediator = new ChatRoom();

        User user1 = new User("Jyotirmay", mediator);
        User user2 = new User("Tejaswini", mediator);

        user1.sendMessages("Hello !!!");
        Thread.sleep(1500);
        user2.sendMessages("Hii");
    }
}
