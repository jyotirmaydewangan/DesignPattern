package com.dewangan.jyotirmay.Structural.Proxy;

/**
 * Created by jyotirmay.d on 01/10/17.
 */
public class Security {
    private Door door;

    public Security(){
        this.door = new LabDoor();
    }

    public void open(String passwd){

        if(authenticate(passwd)){
            door.open();
        } else {
            System.out.println("Wrong password to open Lab Door");
        }
    }

    public void open() {
        System.out.println("Secure Door behind passwd, please provide passwd");
    }

    public void close(){
        door.close();
    }

    private boolean authenticate(String passwd){
        return passwd.equals("passwd");
    }
}
