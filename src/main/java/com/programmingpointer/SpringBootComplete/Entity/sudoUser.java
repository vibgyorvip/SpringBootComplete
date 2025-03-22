package com.programmingpointer.SpringBootComplete.Entity;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class sudoUser {

    public sudoUser(){
        System.out.println("sudo user initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("user hash code : "+ this.hashCode());
    }
}
