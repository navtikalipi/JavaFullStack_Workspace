package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBook {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BookAppConfig.class);

        Books b1=context.getBean("Book1",Books.class);
        b1.setAuthor("J K Rowling");
        System.out.println(b1.getAuthor());

        Books b2=context.getBean("Book2",Books.class);
        b2.setAuthor("Jane Austen");
        System.out.println(b2.getAuthor());

    }
}
