package com.programmingpointer.SpringBootComplete.Entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("OnlineOrderObject")
public class OnlineOrder implements OrderList {

    public OnlineOrder() {
        System.out.println("Online Order initialized");
    }

    @Override
    public void createOrder() {
        System.out.println("Created Online Order");
    }
}
