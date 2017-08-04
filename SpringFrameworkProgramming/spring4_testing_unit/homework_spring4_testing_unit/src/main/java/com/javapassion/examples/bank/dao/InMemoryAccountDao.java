package com.javapassion.examples.bank.dao;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.javapassion.examples.bank.services.AccountNotFoundException;
import com.javapassion.examples.bank.services.DuplicateAccountException;
import com.javapassion.examples.bank.domain.Account;

public class InMemoryAccountDao implements AccountDao {

	private Map<Integer, Account> accounts;

	public InMemoryAccountDao() {
		accounts = Collections.synchronizedMap(new HashMap<Integer, Account>());
	}

	public boolean accountExists(int accountNo) {
		return accounts.containsKey(accountNo);
	}

	public void createAccount(Account account) {
		if (accountExists(account.getAccountNo())) {
			throw new DuplicateAccountException();
		}
		accounts.put(account.getAccountNo(), account);
	}

	public void updateAccount(Account account) {
		if (!accountExists(account.getAccountNo())) {
			throw new AccountNotFoundException();
		}
		accounts.put(account.getAccountNo(), account);
	}

	public void removeAccount(Account account) {
		if (!accountExists(account.getAccountNo())) {
			throw new AccountNotFoundException();
		}
		accounts.remove(account.getAccountNo());
	}

	public Account findAccount(int accountNo) {
		Account account = accounts.get(accountNo);
		if (account == null) {
			throw new AccountNotFoundException();
		}
		return account;
	}
}
