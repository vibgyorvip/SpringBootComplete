package com.programmingpointer.SpringBootComplete.Entity;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class User {
    String username;
    String email;

    @Autowired
    Order order;

    @PostConstruct
    public void initialize(){
        // logging , initialize HashMap obj etc.
        System.out.println("Bean has been constructed and dependency have been injected");
    }

    @PreDestroy
    public void preDestroy(){
        //Db close
        System.out.println("Bean is about to destroy in preDestroy method");
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        System.out.println("initializing User Bean with para constructor");
    }


}
