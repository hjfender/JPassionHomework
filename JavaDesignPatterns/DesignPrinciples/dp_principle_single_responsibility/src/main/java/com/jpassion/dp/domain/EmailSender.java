package com.jpassion.dp.domain;

public class EmailSender {

	private Email email;
	private String emailAddress;
	
	public EmailSender(Email email, String emailAddress){
		this.email = email;
		this.emailAddress = emailAddress;
	}

	public Email getEmail() {
		return email;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	
	//GOOD DESIGN: The logic of sending email can be changed
	//without forcing change in other parts of the application
	public void sendEmail(){
		System.out.println("sending " + getEmail().getEmailContent() + "to " + getEmailAddress());
	}
}
