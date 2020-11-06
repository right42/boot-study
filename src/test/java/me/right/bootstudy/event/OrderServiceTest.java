package me.right.bootstudy.event;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@TestPropertySource(properties = {"logging.level.org.springframework.orm=DEBUG"})
class OrderServiceTest {

    @Autowired
    OrderService orderService;


    @Test
    void orderComplete(){
        Order order = Order.builder()
                .orderId("1234")
                .productName("testProduct")
                .build();

        orderService.order(order);

    }

}