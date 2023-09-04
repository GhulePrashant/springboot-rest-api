package com.prashantghule.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The @SpringBootApplication annotation is the main annotation used to define a SpringBoot apllication.
 * It combines several annotations, including @Configuration @EnableAutoConfiguration @ComponentScan
 */

@SpringBootApplication
public class SpringbootRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestApiApplication.class, args);
	}

}
