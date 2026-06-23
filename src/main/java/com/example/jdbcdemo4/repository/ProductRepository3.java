package com.example.jdbcdemo4.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository3 {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Map<String,Object>> getProducts(double price) {

        String sql =
        "select p.proname, c.catdesc " +
        "from Product p join Category c " +
        "on p.catcode = c.catcode " +
        "where len(p.proname) < 10 " +
        "and p.price > ?";

        return jdbcTemplate.queryForList(
                sql,
                price);
    }
}