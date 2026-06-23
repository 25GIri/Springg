package com.example.quotes.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Primary
@Scope("singleton")
public class FriendshipQuotes implements Quotes {

    @PostConstruct
    public void init() {
        System.out.println("FriendshipQuotes Bean Created");
    }

    @Override
    public void getQuotes() {
        System.out.println("1. A friend in need is a friend indeed.");
        System.out.println("2. Friendship doubles joy.");
        System.out.println("3. True friends never leave.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("FriendshipQuotes Bean Destroyed");
    }
}