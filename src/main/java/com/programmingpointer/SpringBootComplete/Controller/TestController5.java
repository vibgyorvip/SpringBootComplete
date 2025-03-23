package com.programmingpointer.SpringBootComplete.Controller;

import com.programmingpointer.SpringBootComplete.Entity.Employee;
import com.programmingpointer.SpringBootComplete.Entity.UserB;
import com.programmingpointer.SpringBootComplete.Entity.UserC;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Scope("singleton")
public class TestController5 {

    @Autowired
    UserC user;


    public TestController5() {
        System.out.println("Test Controller 5 initialized");
    }

    @PostConstruct
    public void init() {
        System.out.println("Test controller 5 hash code : " + this.hashCode() + " user hash code : " + user.hashCode() );
    }

    @GetMapping("/fetchUser5")
    public ResponseEntity<String> getUserDetails(){
        System.out.println("Fetch User 5 API invoked");
        user.print("hello");
        return ResponseEntity.status(HttpStatus.OK).body("fine");
    }
}
