package com.programmingpointer.SpringBootComplete.Entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("OfflineOrderObject")
public class OfflineOrder implements OrderList{

    public OfflineOrder(){
        System.out.println("Offline Order initialized");
    }

    @Override
    public void createOrder() {
        System.out.println("Offline Order created");
    }
}
