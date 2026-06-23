package com.example.quotes.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Qualifier("hardwork")
@Lazy
@Scope("prototype")
public class HardWorkQuotes implements Quotes {

    @PostConstruct
    public void init() {
        System.out.println("HardWorkQuotes Bean Created");
    }

    @Override
    public void getQuotes() {
        System.out.println("1. Hard work beats talent.");
        System.out.println("2. Success comes through effort.");
        System.out.println("3. Dream big, work hard.");
        System.out.println("4. Consistency creates success.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("HardWorkQuotes Bean Destroyed");
    }
}