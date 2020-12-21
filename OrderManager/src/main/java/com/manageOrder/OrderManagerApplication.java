package com.manageOrder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@EnableJms
@SpringBootApplication
public class OrderManagerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(OrderManagerApplication.class, args);

	}

}
