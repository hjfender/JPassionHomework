package com.jpassion.mvc.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jpassion.mvc.binders.NameTypeEditor;
import com.jpassion.mvc.domain.Account;
import com.jpassion.mvc.validators.AccountValidator;

@Controller
@RequestMapping(value = "/account")
public class AccountController {

	Map<Long,Account> accounts = new ConcurrentHashMap<>();
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.addValidators(new AccountValidator());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat,false));
		binder.registerCustomEditor(String.class, "name", new NameTypeEditor());
	}
	
	// Handle initial form request
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView createAccountForm() {
		ModelAndView mav = new ModelAndView("account/createForm");
		mav.addObject(new Account());
		return mav;
	}

	// Handle form submission
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView createAccount(@Valid Account account, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()){
			mav.setViewName("account/createForm");
			return mav;
		}
		this.accounts.put(account.assignId(), account);
		mav.setViewName("redirect:/account/displayForm?id="+account.getId());
		return mav;
	}
	
	// Display the form data
	@RequestMapping(value = "displayForm", method = RequestMethod.GET)
	public ModelAndView getView(@RequestParam(required = true) Long id) {
		ModelAndView mav = new ModelAndView("account/displayForm");
		Account account = this.accounts.get(id);
		if(account == null){
			throw new ResourceNotFoundException(id);
		}
		mav.addObject(account);
		return mav;
	}
}
