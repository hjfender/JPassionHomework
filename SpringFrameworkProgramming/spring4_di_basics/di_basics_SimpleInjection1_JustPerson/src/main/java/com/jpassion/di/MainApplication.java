package com.jpassion.di;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(BeanConfiguration2.class)
public class MainApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MainApplication.class, args);

		Student student = context.getBean(Student.class);
		System.out.println(getStudentInfo(student));
	}

	public static String getPersonInfo(Person person) {
		return "Name:" + person.getName() + "\n" + "Age:" + person.getAge() + "\n" + "Height: " + person.getHeight()
				+ "\n" + "Is Programmer?: " + person.isProgrammer();
	}
	
	public static String getStudentInfo(Student student) {
		return "Name: " + student.getName() + "\n" + "School: " + student.getSchool();
	}
	
	// <For your own exercise>
	// - Create another configuration file called BeanConfiguration2.java
	// - Create Student class with name and school fields
	// - Configure the Student class as a bean in the BeanConfiguration2

}
