package me.right.bootstudy.event;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class OrderComplete {

    private final String orderId;

}
