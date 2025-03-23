package com.programmingpointer.SpringBootComplete.Controller;

import com.programmingpointer.SpringBootComplete.Entity.UserD;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Scope("session") //object will be created and available throughout the session.
public class TestController6 {

    @Autowired
    UserD user;

    public TestController6(){
        System.out.println("Test controller 6 initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("Test controller hash code : "+ this.hashCode() + " User hash code : " + user.hashCode());
    }

    @GetMapping("/fetchUser6")
    public ResponseEntity<String> getUserDetails(){
        System.out.println("fetchUser API invoked");
        return ResponseEntity.status(HttpStatus.OK).body("mast h");
    }

    @GetMapping("/logout")
    public ResponseEntity<String> logout(HttpServletRequest request){
        System.out.println("end the session");
        HttpSession session = request.getSession();
        session.invalidate();
        return ResponseEntity.status(HttpStatus.OK).body("logged out");
    }

}
