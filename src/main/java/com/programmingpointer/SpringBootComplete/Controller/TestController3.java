package com.programmingpointer.SpringBootComplete.Controller;

import com.programmingpointer.SpringBootComplete.Entity.Student;
import com.programmingpointer.SpringBootComplete.Entity.UserA;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TestController3 {

    @Autowired
    UserA user;

    @Autowired
    Student student;

    public TestController3() {
        System.out.println("Test Controller 3 initialized");
    }

    @PostConstruct
    public void init() {
        System.out.println("Test Controller3 hash code : " + this.hashCode() + " user hash code : " + user.hashCode() + " student hash code : " + student.hashCode());
    }


    @GetMapping("/fetchUser3")
    public ResponseEntity<String> fetchUserDetails(){
        System.out.println("fetch user3 API invoked");
        return ResponseEntity.status(HttpStatus.OK).body("Done");
    }
}
