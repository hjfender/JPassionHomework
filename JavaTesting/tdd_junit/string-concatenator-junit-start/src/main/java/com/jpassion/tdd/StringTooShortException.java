package com.jpassion.tdd;

public class StringTooShortException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StringTooShortException() {
		super();
	}

	public StringTooShortException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public StringTooShortException(String message, Throwable cause) {
		super(message, cause);
	}

	public StringTooShortException(String message) {
		super(message);
	}

	public StringTooShortException(Throwable cause) {
		super(cause);
	}
	
}
