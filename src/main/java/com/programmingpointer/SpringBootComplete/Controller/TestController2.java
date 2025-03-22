package com.programmingpointer.SpringBootComplete.Controller;

import com.programmingpointer.SpringBootComplete.Entity.sudoUser;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController2 {

    @Autowired
    sudoUser sudoUser;

    public TestController2(){
        System.out.println("TestController2 instance initialization");
    }

    @PostConstruct
    public void init(){
        System.out.println("TestController2 hash code : "+ this.hashCode() +"  User hash code : "+ sudoUser.hashCode());
    }

    @GetMapping("/fetchUser2")
    public ResponseEntity<String> getUserDetails(){
        System.out.println("Fetch user2 API invoked");
        return ResponseEntity.status(HttpStatus.OK).body("success");
    }
}
