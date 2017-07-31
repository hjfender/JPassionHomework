package com.jpassion.tdd;

public class StringConcatenator {

	public String concatenate(String str1, String str2) throws StringTooShortException{
		if (str1.length()<2 || str2.length()<2)
			throw new StringTooShortException("Too short string: " + str1 + " " + str2);
		return str1.concat(str2);
	}
}
