package me.right.bootstudy.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;


@Slf4j
@Component
public class OrderCompleteEventListener {

    @Order(Ordered.HIGHEST_PRECEDENCE + 1)
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void orderComplete(OrderComplete orderComplete) {
        log.info("TransactionEventListener order complete orderId : {}", orderComplete.getOrderId());
    }

    @EventListener
    @Order(Ordered.HIGHEST_PRECEDENCE + 2)
    public void orderCompleteLogging(OrderComplete orderComplete) {
        log.info("EventListener order complete orderId : {}", orderComplete.getOrderId());

    }

}
