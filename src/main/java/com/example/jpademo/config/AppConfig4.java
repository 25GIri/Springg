package com.example.jpademo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.example.jpademo")
@EnableJpaRepositories("com.example.jpademo.repository")
public class AppConfig4 {
}