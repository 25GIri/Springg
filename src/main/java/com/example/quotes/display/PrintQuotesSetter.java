package com.example.quotes.display;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.quotes.service.Quotes;

@Component
public class PrintQuotesSetter {

    private Quotes quotes;

    @Autowired
    @Qualifier("hardwork")
    public void setQuotes(Quotes quotes) {
        this.quotes = quotes;
    }

    public void print() {
        quotes.getQuotes();
    }
}