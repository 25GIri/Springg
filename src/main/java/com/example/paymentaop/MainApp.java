package com.example.paymentaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.paymentaop.config.AppConfig;
import com.example.paymentaop.service.Payment;

public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Payment p = context.getBean(Payment.class);

        p.payment();

        System.out.println();

        p.validateCC();

        System.out.println();

        String result = p.process();

        System.out.println("Main Method Received : " + result);

        context.close();
    }
}