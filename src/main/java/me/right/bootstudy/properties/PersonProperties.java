package me.right.bootstudy.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter @Setter
@Component
@ConfigurationProperties("person")
public class PersonProperties {

    private String name;

    private int age;

}
