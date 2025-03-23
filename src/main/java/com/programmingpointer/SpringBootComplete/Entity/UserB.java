package com.programmingpointer.SpringBootComplete.Entity;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
public class UserB {

    public UserB(){
        System.out.println("User initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("user hash code : " + this.hashCode());
    }

}
