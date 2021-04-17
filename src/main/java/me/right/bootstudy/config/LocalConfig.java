package me.right.bootstudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class LocalConfig {

    @Bean
    public Message messageConfigurationBean(){
        return new Message("test");
    }
}
