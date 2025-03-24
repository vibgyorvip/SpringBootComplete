package com.programmingpointer.SpringBootComplete.Entity;

public class OfflineOrderA implements OrderListNew{

    public OfflineOrderA(){
        System.out.println("Offline Order A initialized");
    }

    @Override
    public void createOrder() {
        System.out.println("created Offline Order A");
    }
}
