package com.jpassion.di;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.jpassion.di.services.CustomerService;

@Configuration
@Import(BeanConfiguration.class)
public class MainApplication {

    public static void main(String[] args) {
    	ApplicationContext context = SpringApplication.run(MainApplication.class, args);
    	
    	CustomerService customerService = 
    			(CustomerService) context.getBean(CustomerService.class);
    		System.out.println(customerService.getCustomerGreeting());
    }
}

