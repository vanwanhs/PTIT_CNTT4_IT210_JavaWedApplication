package org.example.session4.com.restaurant.repository;

import org.example.session4.com.restaurant.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    private final List<Order> orders = new ArrayList<>();

    public OrderRepository() {
        orders.add(new Order(1, "Nguyen Van A", "Phở bò", 2, 100000, true));
        orders.add(new Order(2, "Tran Thi B", "Bún chả", 1, 50000, false));
    }

    public List<Order> getAllOrders() {
        return orders;
    }

    public Order getOrderById(int id) {
        return orders.stream()
                .filter(o -> o.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public void addOrder(Order order) {
        orders.add(order);
    }
}

