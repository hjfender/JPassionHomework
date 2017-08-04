package com.javapassion.examples.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javapassion.examples.bank.services.AccountService;

@Controller
public class WithdrawController {

	@Autowired
	private AccountService service;
	
	@RequestMapping("/withdraw.do")
	protected String withdraw(@RequestParam("accountNo") int accountNo, @RequestParam("amount") double amount, ModelMap model) {
		service.withdraw(accountNo, amount);
		
		model.addAttribute("accountNo", accountNo);
		model.addAttribute("balance", service.getBalance(accountNo));
		
		return "success";
	}
}
