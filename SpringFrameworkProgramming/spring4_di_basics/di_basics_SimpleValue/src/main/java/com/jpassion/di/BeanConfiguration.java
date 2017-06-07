package com.jpassion.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Person getPerson() {
		Person person = new Person();
		person.setName("John Smith");
		person.setAge(85);
		person.setHeight(1.99F);
		person.setIsProgrammer(true);
		return person;
	}

	@Bean
	public Student getStudent() {
		Student student = new Student();
		student.setName("Henry");
		student.setSchool("Macalester");
		return student;
	}
}
