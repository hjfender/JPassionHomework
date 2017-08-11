package com.jpassion.dp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateDecorator extends GreetingAbstract implements IGreeting {

	public DateDecorator(IGreeting decoratedTarget) {
		super(decoratedTarget);
	}

	@Override
	public String makeGreeting() {
		return decoratedTarget.makeGreeting() + LocalDateTime.now().format(DateTimeFormatter.ofPattern("EEE MMM dd hh:mm:ss a yyyy "));
	}

}
