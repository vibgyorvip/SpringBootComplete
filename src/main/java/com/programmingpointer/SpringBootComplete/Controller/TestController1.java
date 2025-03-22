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
public class TestController1 {

    @Autowired
    sudoUser sudoUser;

    public TestController1(){
        System.out.println("TestController1 instance initialization");
    }

    @PostConstruct
    public void init(){
        System.out.println("TestController1 hash code : "+ this.hashCode() +"  User hash code : "+ sudoUser.hashCode());
    }

    @GetMapping("/fetchUser1")
    public ResponseEntity<String> getUserDetails(){
        System.out.println("Fetch user1 API invoked");
        return ResponseEntity.status(HttpStatus.OK).body("success");
    }
}
