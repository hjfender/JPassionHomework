package com.jpassion.db.repository;

import java.util.List;

import com.jpassion.db.domain.Account;

public interface AccountRepository {

	public void insert(Account account);
	public Account update(Account transientAccount);
	public void delete(Account account);
	public List<Account> findAll();
	
}
