package org.example.service.impl;

import org.example.service.CustomerSevice;
import org.example.service.OrderService;

public class CustomerSeviceImpl implements CustomerSevice {
    private final OrderService orderService;

    public CustomerSeviceImpl(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void eat() {

    }


    public void sleep() {
        System.out.println("Tôi dang ngủ");
    }
}