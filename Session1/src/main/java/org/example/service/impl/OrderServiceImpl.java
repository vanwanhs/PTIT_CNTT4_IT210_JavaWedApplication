package org.example.service.impl;

import org.example.service.OrderService;

public class OrderServiceImpl implements OrderService {
    @Override
    public void serve(){
        System.out.println("Đang phục vụ khách hàng...");
    }
}
