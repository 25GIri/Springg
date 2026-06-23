package com.example.jpademo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.example.jpademo.entity.Sales1;
import com.example.jpademo.repository.SalesRepository;

@Component
public class TestRunner
implements CommandLineRunner {

    private final SalesRepository repo;

    public TestRunner(
            SalesRepository repo) {

        this.repo = repo;
    }

    @Override
    public void run(String... args) {

        System.out.println(
                repo.findByProduct_Proid(1));

        System.out.println(
                repo.findByQuantityBetween(2,10));

        System.out.println(
                repo.getLessPriceSales());

        System.out.println(
                repo.findAllByOrderByQuantityAsc());

        Page<Sales1> page =
                repo.findAll(
                PageRequest.of(1,4));

        System.out.println(
                page.getContent());
    }
}