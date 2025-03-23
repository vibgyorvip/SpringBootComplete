package com.programmingpointer.SpringBootComplete.Entity;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserC {

    public UserC(){
        System.out.println("User initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("user hash code : " + this.hashCode());
    }

    public void print(String hello) {
        System.out.println("hello vipul");
    }
}
