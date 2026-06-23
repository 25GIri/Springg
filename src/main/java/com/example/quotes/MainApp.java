package com.example.quotes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.quotes.config.AppConfig;
import com.example.quotes.display.DisplayQuotes;
import com.example.quotes.display.PrintQuotesConstructor;
import com.example.quotes.display.PrintQuotesField;
import com.example.quotes.display.PrintQuotesSetter;

public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        PrintQuotesConstructor pc =
                context.getBean(PrintQuotesConstructor.class);
        pc.print();

        System.out.println();

        PrintQuotesSetter ps =
                context.getBean(PrintQuotesSetter.class);
        ps.print();

        System.out.println();

        PrintQuotesField pf =
                context.getBean(PrintQuotesField.class);
        pf.print();

        System.out.println();

        DisplayQuotes dq =
                context.getBean(DisplayQuotes.class);
        dq.show();

        context.close();
    }
}