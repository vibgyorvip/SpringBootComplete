package com.programmingpointer.SpringBootComplete.Entity;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {

    @Autowired
    UserB user;

    public Employee(){
        System.out.println("Employee object initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("Employee hash code : "+ this.hashCode() + " User hash code : "+ user.hashCode());
    }
}
