package com.example.quotes.display;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.quotes.service.Quotes;

@Component
public class PrintQuotesField {

    @Autowired
    private Quotes quotes;

    public void print() {
        quotes.getQuotes();
    }
}