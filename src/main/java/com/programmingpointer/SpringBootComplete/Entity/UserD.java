package com.programmingpointer.SpringBootComplete.Entity;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class UserD {

    public UserD(){
        System.out.println("UserD initialization");
    }

    @PostConstruct
    public void init(){
        System.out.println("User hash code : " + this.hashCode());
    }
}
