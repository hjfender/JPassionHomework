package com.javapassion.examples.bank.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.javapassion.examples.bank.domain.Account;
import com.javapassion.examples.bank.services.AccountNotFoundException;
import com.javapassion.examples.bank.services.DuplicateAccountException;

public class JdbcAccountDao extends JdbcDaoSupport implements AccountDao {

	public void createAccount(Account account) {
		try {
			String sql = "INSERT INTO ACCOUNT (ACCOUNT_NO, BALANCE) VALUES (?, ?)";
			getJdbcTemplate().update(sql, account.getAccountNo(), account.getBalance());
		} catch (DuplicateKeyException dkEx) {
			throw new DuplicateAccountException();
		}
	}

	public void updateAccount(Account account) {
		try {
			String sql = "UPDATE ACCOUNT SET BALANCE = ? WHERE ACCOUNT_NO = ?";
			int updatedRowNum = getJdbcTemplate().update(sql, account.getBalance(), account.getAccountNo());
			if (updatedRowNum == 0) {
				throw new AccountNotFoundException();
			}
		} catch (DataAccessException daEx) {
			throw new AccountNotFoundException();
		}
	}

	public void removeAccount(Account account) {
		String sql = "DELETE FROM ACCOUNT WHERE ACCOUNT_NO = ?";
		int updatedRowNum = getJdbcTemplate().update(sql, account.getAccountNo());
		if (updatedRowNum == 0) {
			throw new AccountNotFoundException();
		}
	}

	public Account findAccount(int accountNo) {
		String sql = "SELECT BALANCE FROM ACCOUNT WHERE ACCOUNT_NO = ?";
		Account account = null;
		try {
			double balance;
			balance = getJdbcTemplate().queryForObject(sql, Double.class, accountNo);
			account = new Account(accountNo, balance);
		} catch (DataAccessException e) {
			throw new AccountNotFoundException();
		}
		return account;
	}
}
