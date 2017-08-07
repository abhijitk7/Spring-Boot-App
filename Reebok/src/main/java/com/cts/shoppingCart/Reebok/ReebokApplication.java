package com.cts.shoppingCart.Reebok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(value="com.cts.shoppingCart")
@EnableJpaRepositories(basePackages = "com.cts.shoppingCart.repository")
@EntityScan(value="com.cts.shoppingCart.model")
public class ReebokApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReebokApplication.class, args);
	}
}
