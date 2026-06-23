package com.example.quotes.display;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.quotes.service.Quotes;

@Component
public class DisplayQuotes {

    @Autowired
    private Quotes quotes;

    public void show() {
        quotes.getQuotes();
    }
}