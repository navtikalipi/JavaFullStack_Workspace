package com.example;

import com.example.model.Cricket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication //It is a bundle of other annotations-
//@ComponentScan("com.example)+ @Configuration+ @EnableAutoConfiguration
public class DemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
		Cricket cr =new Cricket();
		//cr.canEqual(); All functionality accessible without doing constructor/getter/setter etc

	}

}
