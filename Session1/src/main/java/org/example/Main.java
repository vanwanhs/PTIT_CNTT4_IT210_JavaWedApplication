package org.example;

import org.example.configs.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext(
//                        AppConfiguration.class
//                );
//        Person fullStack =  context.getBean("person",Person.class);
//        System.out.println(fullStack);
        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        AppConfiguration.class
                );
        Person person = context.getBean("person",Person.class);
        System.out.println(person);
    }
}