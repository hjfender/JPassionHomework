package com.jpassion.dp;

public class SimpleGreeting implements IGreeting {

	@Override
	public void sayHello(String greeting) {
		System.out.println(greeting);
	}

}
