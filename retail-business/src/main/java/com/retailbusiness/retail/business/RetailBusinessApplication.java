package com.retailbusiness.retail.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class RetailBusinessApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailBusinessApplication.class, args);
	}

}
