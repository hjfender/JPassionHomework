package com.javapassion.examples.bank.domain;

public class Account {

	private int accountNo;
	private double balance;

	public Account() {
	}

	public Account(int accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Account)) {
			return false;
		}
		Account account = (Account) obj;
		return (account.accountNo == accountNo) && account.balance == balance;
	}
}
