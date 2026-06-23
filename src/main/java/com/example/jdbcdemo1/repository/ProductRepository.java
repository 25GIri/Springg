package com.example.jdbcdemo1.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Double getAveragePrice() {

        String sql =
                "select avg(price) from Product";

        return jdbcTemplate.queryForObject(
                sql,
                Double.class);
    }
}