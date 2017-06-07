package com.jpassion.di;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(BeanConfiguration.class)
public class MainApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MainApplication.class, args);

		Person s0 = context.getBean(Person.class);
		Person s1 = (Person) context.getBean("name1");
		Person s2 = (Person) context.getBean("name2");
		Person s3 = (Person) context.getBean("name3");
		Person s4 = (Person) context.getBean("name4");

		System.out.println((s0 == s1));
		System.out.println((s1 == s2));
		System.out.println((s2 == s3));
		System.out.println((s3 == s4));

		String[] x = context.getAliases("name1");
		System.out.println("aliases = " + x[0] + " " + x[1] + " " + x[2]);

	}
	
	// <For your own exercise>
	// - Create FamilyInfo bean
	// - Give it "FamilyInfo1" and "FamilyInfo2" alias names
	// - Access the bean using alias names

}
