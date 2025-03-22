package com.programmingpointer.SpringBootComplete.Config;

import com.programmingpointer.SpringBootComplete.Entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public User createUserBean(){
        return new User("vipul","vipul@cisco.com");
    }


}
