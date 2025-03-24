package com.programmingpointer.SpringBootComplete.Config;

import com.programmingpointer.SpringBootComplete.Entity.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public User createUserBean() {
        return new User("vipul", "vipul@cisco.com");
    }

    @Bean
    public OrderListNew createOrderBean(@Value("${isOnlineOrder}") boolean isOnlineOrder) {
        if (isOnlineOrder) {
            return new OnlineOrderA();
        } else {
            return new OfflineOrderA();
        }
    }


}
