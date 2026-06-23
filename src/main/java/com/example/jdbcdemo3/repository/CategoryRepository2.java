package com.example.jdbcdemo3.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepository2 {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int insertCategory(
            int catcode,
            String catdesc) {

        String sql =
        "insert into Category values(?,?)";

        return jdbcTemplate.update(
                sql,
                catcode,
                catdesc);
    }
}