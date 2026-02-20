package com.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean("Movie1")
    public Movie getMovie1() {
        return new Movie();
    }

    @Bean("Movie2")
    public Movie getMovie2() {
        return new Movie();
    }
}
