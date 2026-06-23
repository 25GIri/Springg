package com.example.jdbcdemo3.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.example.jdbcdemo3")
public class AppConfig2 {

    @Bean
    public DataSource createDataSource() {

        DriverManagerDataSource ds =
                new DriverManagerDataSource();

        ds.setDriverClassName(
                "com.microsoft.sqlserver.jdbc.SQLServerDriver");

        ds.setUrl(
        "jdbc:sqlserver://localhost:1433;databaseName=productdbbb;encrypt=true;trustServerCertificate=true");

        ds.setUsername("sa");
        ds.setPassword("StrongPass@123");

        return ds;
    }

    @Bean
    public JdbcTemplate createJdbcTemplate(
            DataSource ds) {

        return new JdbcTemplate(ds);
    }
}