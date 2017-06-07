package com.jpassion.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean(name={"name1", "name2", "name3", "name4"})
	public Person getPerson() {
		Person person = new Person();
		return person;
	}

}
