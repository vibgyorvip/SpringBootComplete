package com.programmingpointer.SpringBootComplete.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class primeUser {

    //@Autowired
    public final Order order; // can make immutable while using constructor injection

//    @Autowired
//    public void setOrderDependency(Order order){
//        this.order = order;
//    }

    @Autowired //optional
    public primeUser(Order order){
        this.order = order ;
        System.out.println("initializing primeUser");
    }



}
