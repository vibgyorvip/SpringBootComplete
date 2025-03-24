package com.programmingpointer.SpringBootComplete.Entity;

public class OnlineOrderA implements OrderListNew {

    public OnlineOrderA() {
        System.out.println("Online Order A initialized");
    }

    @Override
    public void createOrder() {
        System.out.println("Created Online Order A");
    }
}
