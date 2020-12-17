package me.right.bootstudy;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import java.util.Objects;

@SpringBootApplication
@EnableAsync
public class BootStudyApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(BootStudyApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.SERVLET);
        springApplication.run(args);
    }


    @Component
    private static class AppRunner implements ApplicationRunner {

        @Override
        public void run(ApplicationArguments args) throws Exception {
            Resource resource = new ClassPathResource("application.yml");

            System.out.printf(Objects.requireNonNull(resource.getFilename()));
        }
    }


}



