package org.example.configs;


import org.example.Person;
import org.example.service.CustomerSevice;
import org.example.service.OrderService;
import org.example.service.impl.CustomerSeviceImpl;
import org.example.service.impl.OrderServiceImpl;
import org.springframework.context.annotation.Bean;

public class AppConfiguration {

    @Bean
    public Person person() {
        return new Person(1, "Nguyen", "Computer Science");
    }
    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl() ;
    }
    @Bean
public CustomerSevice customerSevice(){
    return new CustomerSeviceImpl(orderService());
    }
}