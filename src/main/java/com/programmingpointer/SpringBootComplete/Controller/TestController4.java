package com.programmingpointer.SpringBootComplete.Controller;

import com.programmingpointer.SpringBootComplete.Entity.Employee;
import com.programmingpointer.SpringBootComplete.Entity.UserB;
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
@Scope("request")
public class TestController4 {

    @Autowired
    UserB user;

    @Autowired
    Employee employee;

    public TestController4() {
        System.out.println("Test Controller 4 initialized");
    }

    @PostConstruct
    public void init() {
        System.out.println("Test controller hash code : " + this.hashCode() + " user hash code : " + user.hashCode() + " employee hash code : " + employee.hashCode());
    }

    @GetMapping("/fetchUser")
    public ResponseEntity<String> getUserDetails(){
        System.out.println("Fetch User 4 API invokded");
        return ResponseEntity.status(HttpStatus.OK).body("shi h");
    }
}
