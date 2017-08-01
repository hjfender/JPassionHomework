package com.jpassion.mockito;

import com.jpassion.mockito.domain.Adder;
import com.jpassion.mockito.domain.Computer;
import com.jpassion.mockito.domain.Subtractor;

public class Main {
	public static void main(String[] args) {
		int x = 5, y = 2;
		Computer computer = new Computer(new Adder(), new Subtractor());
	    System.out.println("Addition result = " + computer.computeSquareAfterAddition(x, y));
	    System.out.println("Subtraction result = " + computer.computeSquareAfterSubtraction(x, y));
	}

}
