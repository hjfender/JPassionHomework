package com.javapassion.examples;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldGreetingProvider implements GreetingProvider {

    public String getGreeting() {

        return "Hello World!";
    }

}