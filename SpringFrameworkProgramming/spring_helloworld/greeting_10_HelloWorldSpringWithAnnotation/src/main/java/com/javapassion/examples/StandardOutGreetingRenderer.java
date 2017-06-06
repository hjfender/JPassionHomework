package com.javapassion.examples;

import org.springframework.beans.factory.annotation.Autowired;

public class StandardOutGreetingRenderer implements GreetingRenderer {

	@Autowired
    private GreetingProvider greetingProvider = null;

    public void speak() {
        if (greetingProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                            + StandardOutGreetingRenderer.class.getName());
        }

        System.out.println(greetingProvider.getGreeting());
    }

}