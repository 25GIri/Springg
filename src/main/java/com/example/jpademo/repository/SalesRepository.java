package com.example.jpademo.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.jpademo.entity.Sales1;

public interface SalesRepository
extends JpaRepository<Sales1,Integer> {

    List<Sales1> findByProduct_Proid(int proid);

    List<Sales1> findByQuantityBetween(
            int start,
            int end);

    @Query("""
           select s
           from Sales1 s
           where s.pricepersold
           < s.product.price
           """)
    List<Sales1> getLessPriceSales();

    List<Sales1> findAllByOrderByQuantityAsc();

    Page<Sales1> findAll(Pageable pageable);
}