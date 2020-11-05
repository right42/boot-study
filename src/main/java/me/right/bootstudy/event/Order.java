package me.right.bootstudy.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder @AllArgsConstructor
public class Order {

    private final String orderId;

    private final String productName;
}
