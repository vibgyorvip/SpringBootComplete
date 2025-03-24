package com.programmingpointer.SpringBootComplete.Controller;

import com.programmingpointer.SpringBootComplete.Entity.OrderList;
import com.programmingpointer.SpringBootComplete.Entity.OrderListNew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserControllerA {


    @Autowired
    OrderListNew order;

    @PostMapping("/createOrderA")
    public ResponseEntity<String> createOrder() {
        order.createOrder();
        return ResponseEntity.status(HttpStatus.OK).body("Order Created");
    }
}
