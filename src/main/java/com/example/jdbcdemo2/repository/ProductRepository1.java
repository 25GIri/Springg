package com.example.jdbcdemo2.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository1 {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Map<String,Object>> getCategoryAvgPrice() {

        String sql =
        "select catcode, avg(price) as avgprice " +
        "from Product " +
        "group by catcode";

        return jdbcTemplate.queryForList(sql);
    }
}