package com.example.jdbcdemo4;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.jdbcdemo4.config.AppConfig3;
import com.example.jdbcdemo4.repository.ProductRepository3;

public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        AppConfig3.class);

        ProductRepository3 repo =
                context.getBean(
                        ProductRepository3.class);

        List<Map<String,Object>> list =
                repo.getProducts(1000);

        for(Map<String,Object> row : list) {

            System.out.println(
                    row.get("proname")
                    + " "
                    + row.get("catdesc"));
        }

        context.close();
    }
}