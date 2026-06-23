package com.example.jdbcdemo3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.jdbcdemo3.config.AppConfig2;
import com.example.jdbcdemo3.repository.CategoryRepository2;

public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        AppConfig2.class);

        CategoryRepository2 repo =
                context.getBean(
                        CategoryRepository2.class);

        int rows =
                repo.insertCategory(
                        104,
                        "Fashion");

        System.out.println(
                rows + " Record Inserted");

        context.close();
    }
}