package com.jpassion.dp;

public class LocationDecorator extends GreetingAbstract implements IGreeting {

	public LocationDecorator(IGreeting decoratedTarget) {
		super(decoratedTarget);
	}

	@Override
	public String makeGreeting() {
		return decoratedTarget.makeGreeting() + "Minneapolis ";
	}

}
