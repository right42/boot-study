package me.right.bootstudy.event;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final ApplicationEventPublisher applicationEventPublisher;

    @Transactional
    public void order(Order order){
        System.out.println("order service : " + TransactionSynchronizationManager.getCurrentTransactionName());

        // order processing..

        applicationEventPublisher.publishEvent(new OrderComplete(order.getOrderId()));
    }

}
