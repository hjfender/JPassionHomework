package com.jpassion.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.jpassion.mvc.interceptors.MyInterceptor;

@Configuration
@ComponentScan("com.jpassion")
@EnableAutoConfiguration
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	
	@Bean
	WebMvcConfigurerAdapter mvcViewConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addInterceptors(InterceptorRegistry registry){
				registry.addInterceptor(new MyInterceptor());
			}
		};
	}
}
