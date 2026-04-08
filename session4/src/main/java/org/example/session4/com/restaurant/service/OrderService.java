package org.example.session4.com.restaurant.service;

import org.example.session4.com.restaurant.model.Order;
import org.example.session4.com.restaurant.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderService {
    private OrderRepository orderRepository;
    @Autowired
    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }
    public List<Order> getAllOrder(){
        return orderRepository.getAllOrders();
    }
    public Order getOrderById(int id){
        return orderRepository.getOrderById(id);
    }
    public void addOrder(Order order){
        orderRepository.addOrder(order);
    }
}
