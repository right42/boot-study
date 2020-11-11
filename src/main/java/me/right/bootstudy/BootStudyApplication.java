package me.right.bootstudy;

import lombok.RequiredArgsConstructor;
import me.right.bootstudy.properties.PersonProperties;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableAsync
public class BootStudyApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(BootStudyApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
    }

    @Component
    @RequiredArgsConstructor
    public static class AppRunner implements ApplicationRunner {

        private final PersonProperties personProperties;

        @Override
        public void run(ApplicationArguments args) throws Exception {
            System.out.println("============================");
            System.out.println(personProperties.getName());
            System.out.println("============================");
        }
    }


}



