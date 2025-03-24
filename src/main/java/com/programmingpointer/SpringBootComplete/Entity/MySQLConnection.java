package com.programmingpointer.SpringBootComplete.Entity;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "sqlconnection", value = "enabled", havingValue = "true", matchIfMissing = false)
public class MySQLConnection {
    MySQLConnection(){
        System.out.println("MySQLConnection Bean initialization");
    }
}
