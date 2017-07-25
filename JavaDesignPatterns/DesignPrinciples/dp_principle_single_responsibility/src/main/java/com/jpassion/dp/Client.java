package com.jpassion.dp;

import com.jpassion.dp.domain.Email;
import com.jpassion.dp.domain.EmailSender;
import com.jpassion.dp.domain.Person;

public class Client {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Sang");
		
		Email email = new Email();
		email.setEmailContent("Hello, JPassion.com!");
		
		//Email is sent via EmailSender class
		EmailSender emailSender = new EmailSender(email, "dest@jpassion.com");
		emailSender.sendEmail();
	}
}
