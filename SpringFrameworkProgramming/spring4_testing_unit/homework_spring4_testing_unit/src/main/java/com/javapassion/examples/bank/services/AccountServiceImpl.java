package com.javapassion.examples.bank.services;

import com.javapassion.examples.bank.services.InsufficientBalanceException;
import com.javapassion.examples.bank.dao.AccountDao;
import com.javapassion.examples.bank.domain.Account;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;

	public AccountServiceImpl(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void createAccount(int accountNo) {
		accountDao.createAccount(new Account(accountNo, 0));
	}

	public void removeAccount(int accountNo) {
		Account account = accountDao.findAccount(accountNo);
		accountDao.removeAccount(account);
	}

	public void deposit(int accountNo, double amount) {
		Account account = accountDao.findAccount(accountNo);
		account.setBalance(account.getBalance() + amount);
		accountDao.updateAccount(account);
	}

	public void withdraw(int accountNo, double amount) {
		Account account = accountDao.findAccount(accountNo);
		if (account.getBalance() < amount) {
			throw new InsufficientBalanceException();
		}
		account.setBalance(account.getBalance() - amount);
		accountDao.updateAccount(account);
	}

	public double getBalance(int accountNo) {
		return accountDao.findAccount(accountNo).getBalance();
	}
}
