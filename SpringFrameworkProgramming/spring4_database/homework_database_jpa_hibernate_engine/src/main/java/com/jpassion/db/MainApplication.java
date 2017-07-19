package com.jpassion.db;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.jpassion.db.domain.Account;
import com.jpassion.db.repository.AccountRepository;

@SpringBootApplication
@Import(DatabaseConfiguration.class)
public class MainApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class, args);
	
		AccountRepository accountRepository = (AccountRepository) context.getBean("accountRepository");
		
		Account account1 = new Account("Euclid", 1000);
		Account account2 = new Account("Pythagoras", 2000);
		Account account3 = new Account("Goethe", 3000);
		
		accountRepository.insert(account1);
		accountRepository.insert(account2);
		accountRepository.insert(account3);
		
		account2.setBalance(1500);
		accountRepository.update(account2);
		
		accountRepository.delete(account3);
		
		List<Account> accounts = accountRepository.findAll();
		
		for(Account account : accounts){
			System.out.println("===Account " + account.getId()+"===");
			System.out.println("--->Name: " + account.getName());
			System.out.println("--->Balance: " + account.getBalance());
		}
	}
}
