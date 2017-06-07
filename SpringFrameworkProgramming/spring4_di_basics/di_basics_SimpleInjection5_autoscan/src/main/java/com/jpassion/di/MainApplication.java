package com.jpassion.di;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jpassion.beans1.Person;

@Configuration
@ComponentScan(basePackages = { "com.jpassion.beans1", "com.jpassion.beans2" })
public class MainApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MainApplication.class, args);

		Person person = context.getBean(Person.class);
		System.out.println(getPersonInfo(person));
	}

	public static String getPersonInfo(Person person) {
		return "Name:" + person.getName() + "\n" + "Age:" + person.getAge() + "\n" + "Height: " + person.getHeight()
		+ "\n" + "Is Programmer?: " + person.isProgrammer() + "\n" + "Address: " + person.getAddress()
				.getStreetNumber()
		+ " " + person.getAddress()
				.getStreetName()
		+ " " + person.getAddress()
				.getCity()
		+ " " + person.getAddress()
				.getCountry()
		+ "\n" + "Family Info: " + "Father - " + person.getFamilyInfo().getFatherName() + ", "
		+ "Mother - " + person.getFamilyInfo().getMotherName() + ", "
		+ "Number of siblings - " + person.getFamilyInfo().getNumberOfSiblings();
	}
	
	// < For your own exercise>
	// - Move Person and Address Bean into its own package
	//   "com.jpassion.beans1" from "com.jpassion.di"
	// - Create FamilyInfo bean in another package "com.jpassion.beans2"
	// - Autoscan Person, Address, FamilyInfo beans

}
