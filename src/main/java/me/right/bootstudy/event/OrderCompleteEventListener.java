package me.right.bootstudy.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Component
@Slf4j
public class OrderCompleteEventListener {


    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void orderComplete(OrderComplete orderComplete) {
        System.out.println("orderComplete : " + TransactionSynchronizationManager.getCurrentTransactionName());
        log.info(orderComplete.getOrderId());
    }

}
