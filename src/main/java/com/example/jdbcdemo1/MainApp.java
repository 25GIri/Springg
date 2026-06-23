package com.example.jdbcdemo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.jdbcdemo1.config.AppConfig;
import com.example.jdbcdemo1.repository.ProductRepository;

public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        AppConfig.class);

        ProductRepository repo =
                context.getBean(
                        ProductRepository.class);

        Double avg =
                repo.getAveragePrice();

        System.out.println(
                "Average Price = " + avg);

        context.close();
    }
}