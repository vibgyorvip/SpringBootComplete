package com.programmingpointer.SpringBootComplete.Entity;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class UserA {

    public UserA(){
        System.out.println("User initialization");
    }

    @PostConstruct
    public void init(){
        System.out.println("UserA hash code : "+ this.hashCode());
    }
}
