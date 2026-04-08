package org.example.session4.com.restaurant.config;

import org.jspecify.annotations.Nullable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@Nullable
@ComponentScan(basePackages = ("org.example.session4"))
public class AppConfig {
    // Cấu hình bean viewResolver để đọc view
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        // Cấu hình tiền tố
        viewResolver.setPrefix("WEB-INF/views/");
        //Cấu hình hậu tố
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
