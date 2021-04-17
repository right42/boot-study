package me.right.bootstudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class TestConfiguration {

    @Bean
    public Message messageServiceBean(){
        return new Message("test");
    }

}
