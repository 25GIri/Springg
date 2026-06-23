package com.example.jdbcdemo2;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.jdbcdemo2.config.AppConfig1;
import com.example.jdbcdemo2.repository.ProductRepository1;

public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        AppConfig1.class);

        ProductRepository1 repo =
                context.getBean(ProductRepository1.class);

        List<Map<String,Object>> list =
                repo.getCategoryAvgPrice();

        System.out.println("CatCode\tAvgPrice");

        for(Map<String,Object> row : list) {

            System.out.println(
                    row.get("catcode")
                    + "\t"
                    + row.get("avgprice"));
        }

        context.close();
    }
}