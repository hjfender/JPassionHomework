package com.jpassion.mvc.domain;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Account {

	private static final AtomicLong idSequence = new AtomicLong();
	
	private Long id;
	
	@NotEmpty
	@Size(min=5,max=10)
	private String name;
	
	@NotEmpty
	private String hobby;
	
	@NotNull
	@SuppressWarnings("deprecation")
	private Date birthday = new Date(100, 7, 8);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	
	public Long assignId() {
		this.id = idSequence.incrementAndGet();
		return id;
	}
}
