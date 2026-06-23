package com.example.quotes.display;

import org.springframework.stereotype.Component;

import com.example.quotes.service.Quotes;

@Component
public class PrintQuotesConstructor {

    private Quotes quotes;

    public PrintQuotesConstructor(Quotes quotes) {
        this.quotes = quotes;
    }

    public void print() {
        quotes.getQuotes();
    }
}