package me.right.bootstudy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.right.bootstudy.properties.PersonProperties;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;

import java.nio.file.Files;
import java.util.stream.Stream;

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
    @Slf4j
    public static class AppRunner implements ApplicationRunner {

        private final PersonProperties personProperties;

        private final ResourceLoader resourceLoader;

        private final ConversionService conversionService;

        @Override
        public void run(ApplicationArguments args) throws Exception {
            Resource bookYmlResource = resourceLoader.getResource("classpath:book.yml");

            try (Stream<String> lines = Files.lines(bookYmlResource.getFile().toPath())) {
                lines.forEach(log::info);
            }


        }
    }


}



