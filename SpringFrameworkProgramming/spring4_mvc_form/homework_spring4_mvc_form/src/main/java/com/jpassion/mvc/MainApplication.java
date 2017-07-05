package com.jpassion.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
	
	@Bean
	WebMvcConfigurerAdapter mvcViewConfigurer(){
		return new WebMvcConfigurerAdapter(){
			@Override
			public void addViewControllers(ViewControllerRegistry registry){
				registry.addRedirectViewController("/", "/account");
			}
		};
	}
}
