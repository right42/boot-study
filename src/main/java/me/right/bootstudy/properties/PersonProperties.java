package me.right.bootstudy.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
@Component
@ConfigurationProperties("person")
@Validated
public class PersonProperties {

    private String name;

    private int age;

}
