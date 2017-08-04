package com.javapassion.examples.bank.services;

public interface AccountService {

	public void createAccount(int accountNo);

	public void removeAccount(int accountNo);

	public void deposit(int accountNo, double amount);

	public void withdraw(int accountNo, double amount);

	public double getBalance(int accountNo);
}
