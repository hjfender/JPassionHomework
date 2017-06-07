package com.jpassion.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration2 {
	
	@Bean
	public Student getStudent(){
		return new Student();
	}
}
