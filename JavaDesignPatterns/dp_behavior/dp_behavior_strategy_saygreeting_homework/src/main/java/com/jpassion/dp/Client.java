package com.jpassion.dp;

import com.jpassion.dp.domain.AfternoonGreetingStrategy;
import com.jpassion.dp.domain.IGreetingStrategy;
import com.jpassion.dp.domain.MorningGreetingStrategy;
import com.jpassion.dp.domain.strategy.Greeting_context;

// TODO (Homework): Build a greeter system with different greeting strategies, 
// MorningGreetingStrategy or AfternoonGreetingStrategy depending 
// on some business condition such as time of the day (or you can 
// hard code it for homework purpose)

// <Steps to follow>
// 0. Uncomment the client code below
// 1. Create 'IGreetingStrategy" interface, which abstracts greeting 
// 2. Create Concrete strategy classes, "MorningGreetingStrategy" 
//    and "AfternoonGreetingStrategy", implementing 'IGreetingStrategy" interface
// 3. Create context object, which receives "IGreetingStrategy" object via one
//    of the three schemes: via constructor, via setter method, or as an argument
// <Optional step>
// 4. Add "EveningGreetingStrategy"

// Result of running this application might look as following
//
// Good morning, john I am sang

public class Client {
	public static void main(String[] args) {
		
		Greeting_context greeting_context = new Greeting_context();

		String greetingMessage = greeting_context.setGreetingStrategy(decideGreetingStrategy()).getGreetingMessage("sang", "john" );
		System.out.println(greetingMessage);
		
	}

	// Choose greeting strategy during runtime
	private static IGreetingStrategy decideGreetingStrategy() {
		boolean test = true; // hard-code the selection of greeting strategy
		return test? new MorningGreetingStrategy():
		             new AfternoonGreetingStrategy();
	}
}