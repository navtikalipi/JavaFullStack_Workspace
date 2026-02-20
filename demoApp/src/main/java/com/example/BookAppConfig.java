package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookAppConfig {
        @Bean("Book1")
        public Books getBooks1(){
            return new Books();
        }
        @Bean("Book2")
    public Books getBooks2(){
            return new Books();
        }


    }
