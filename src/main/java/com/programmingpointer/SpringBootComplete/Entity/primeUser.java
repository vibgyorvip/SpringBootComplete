package com.programmingpointer.SpringBootComplete.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class primeUser {

    @Autowired
    Order order;

    public primeUser(){
        System.out.println("initializing primeUser");
    }


}
