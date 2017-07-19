package com.jpassion.db.domain;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "BALANCE")
	private int balance;
	
	public Account() {}
	
	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
