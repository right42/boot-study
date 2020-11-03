package me.right.bootstudy;

import lombok.RequiredArgsConstructor;
import me.right.bootstudy.config.Message;
import me.right.bootstudy.properties.BookProperties;
import me.right42.Person;
import org.h2.security.auth.H2AuthConfig;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.Duration;

@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class, DataSourceAutoConfiguration.class})
public class BootStudyApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(BootStudyApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
    }


    @Component
    @RequiredArgsConstructor
    public static class AppRunner implements ApplicationRunner {

        private final Message message;

        private final BookProperties  bookProperties;

        @Override
        public void run(ApplicationArguments args) {
            System.out.println(bookProperties.getTitle());
            System.out.println(bookProperties.getWriter());
        }
    }

}

