package com.jpassion.db.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpassion.db.domain.Account;

@Repository("accountRepository")
public class JpaAccountRepository implements AccountRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void insert(Account account) {
		entityManager.persist(account);
	}

	@Override
	@Transactional
	public Account update(Account transientAccount) {
		return entityManager.merge(transientAccount);
	}

	@Override
	@Transactional
	public void delete(Account account) {
		Account acnt = entityManager.find(Account.class, account.getId());
		entityManager.remove(acnt);
	}

	@Override
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Account> findAll() {
		Query query = entityManager.createQuery("from Account");
		return query.getResultList();
	}

}
