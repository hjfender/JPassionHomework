package com.javapassion.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("renderer")   // This is the same as @Component(value="renderer")
public class StandardOutGreetingRenderer implements GreetingRenderer {

	@Autowired
    private GreetingProvider messageProvider = null;

    public void speak() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                            + StandardOutGreetingRenderer.class.getName());
        }

        System.out.println(messageProvider.getGreeting());
    }

}