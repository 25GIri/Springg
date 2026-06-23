package com.example.paymentaop.service;

import org.springframework.stereotype.Component;

@Component
public class Payment {

    public void payment() {
        System.out.println("Payment Method Executed");
    }

    public void validateCC() {
        System.out.println("Credit Card Validated");
    }

    public String process() {
        System.out.println("Processing Payment...");
        return "Payment Successful";
    }
}