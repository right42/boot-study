package me.right.bootstudy;

import me.right.bootstudy.config.LocalConfig;
import me.right.bootstudy.config.Message;
import me.right.bootstudy.config.TestConfiguration;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class BootStudyApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void singletonTest(){
        LocalConfig localConfig = (LocalConfig) applicationContext.getBean("localConfig");
        TestConfiguration testConfiguration = (TestConfiguration) applicationContext.getBean("testConfiguration");

        System.out.println(localConfig.messageConfigurationBean());
        System.out.println(localConfig.messageConfigurationBean());
        System.out.println("==================================");
        System.out.println(testConfiguration.messageServiceBean());
        System.out.println(testConfiguration.messageServiceBean());

    }

}

