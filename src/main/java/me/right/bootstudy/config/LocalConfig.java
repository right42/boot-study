package me.right.bootstudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("local")
@Configuration
public class LocalConfig {

    @Bean
    public Message message(){
        return new Message("Local profile");
    }
}
