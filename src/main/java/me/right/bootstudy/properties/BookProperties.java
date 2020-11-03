package me.right.bootstudy.properties;

import lombok.Getter;
import lombok.Setter;
import me.right.bootstudy.config.YamlPropertySourceFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
@ConfigurationProperties("book")
@PropertySource(value = "classpath:book.yml", factory = YamlPropertySourceFactory.class)
public class BookProperties {

    private String title;

    private String writer;

}
