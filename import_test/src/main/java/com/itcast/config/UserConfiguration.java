package com.itcast.config;

import org.springframework.context.annotation.Bean;

public class UserConfiguration {

    @Bean
    public User hetUser(){
        User user = new User();
        user.setAge(12);
        user.setName("giser");
        return user;
    }

}
