package com.jpassion.mvc.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.jpassion.mvc.domain.Account;

public class AccountValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Account.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Account account = (Account) target;

		if (!account.getHobby().equalsIgnoreCase("Swimming") && !account.getHobby().equalsIgnoreCase("Golf")
				&& !account.getHobby().equalsIgnoreCase("Walking")) {
			errors.rejectValue("hobby", "value.invalidHobby", "Hobby must be one of Swimming, Golf, or Walking!");
		}

	}

}
