package org.example;

import org.example.configs.AppConfiguration;
import org.example.service.CustomerSevice;
import org.example.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class MainTest {
    ApplicationContext context = new AnnotationConfigApplicationContext(
            AppConfiguration.class
    );
    CustomerSevice customerSevice = context.getBean("CustomerSevice",CustomerSevice.class);

}
