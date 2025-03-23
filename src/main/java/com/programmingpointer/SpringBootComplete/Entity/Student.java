package com.programmingpointer.SpringBootComplete.Entity;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    UserA user;

    public Student(){
        System.out.println("Student initialization");
    }

    @PostConstruct
    public void init(){
        System.out.println("Student hash code : "+ this.hashCode() + " user hash code : "+ user.hashCode());
    }
}
