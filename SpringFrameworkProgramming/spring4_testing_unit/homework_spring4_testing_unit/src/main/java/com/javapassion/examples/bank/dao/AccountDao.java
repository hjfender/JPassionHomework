package com.javapassion.examples.bank.dao;

import com.javapassion.examples.bank.domain.Account;

public interface AccountDao {

	public void createAccount(Account account);

	public void updateAccount(Account account);

	public void removeAccount(Account account);

	public Account findAccount(int accountNo);
}
