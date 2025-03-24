package com.programmingpointer.SpringBootComplete.Entity;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class DBConnection {

    @Autowired(required = false)
    MySQLConnection mySQLConnection;

    @Autowired(required = false)
    NoSQLConnection noSQLConnection;

    @PostConstruct
    public void init(){
        System.out.println("DB Connection Bean created with dependencies below:");
        System.out.println("is MySQLConnection object null: " + Objects.isNull(mySQLConnection));
        System.out.println("is NoSQLConnection object null: " + Objects.isNull(noSQLConnection));
    }
}
