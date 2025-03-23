package com.programmingpointer.SpringBootComplete.Controller;

import com.programmingpointer.SpringBootComplete.Entity.Order;
import com.programmingpointer.SpringBootComplete.Entity.OrderList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Qualifier("OnlineOrderObject")
    @Autowired
    OrderList onlineOrderObj;

    @Qualifier("OfflineOrderObject")
    @Autowired
    OrderList offlineOrderObj;

    @PostMapping("/createOrder")
    public ResponseEntity<String> createOrder(@RequestParam boolean isOnlineOrder) {

        if (isOnlineOrder) {
            onlineOrderObj.createOrder();
        } else {
            offlineOrderObj.createOrder();
        }
        return ResponseEntity.status(HttpStatus.OK).body("Order Created");
    }
}
