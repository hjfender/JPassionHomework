package com.jpassion.mockito.domain;

public class Computer {
	
	private Adder adder;
	private Subtractor subtractor;
	
	public Computer(){
	}

	public Computer(Adder adder, Subtractor subtractor) {
		this.adder = adder;
		this.subtractor = subtractor;
	}

	public int computeSquareAfterAddition(int x, int y) throws RuntimeException {
		if(x<0||y<0)
			throw new RuntimeException("negative number not allowed: " + x + " " + y);
		return adder.add(x, y) * adder.add(x, y);
	}
	
	public int computeSquareAfterSubtraction(int x, int y) throws RuntimeException {
		if(x<0||y<0)
			throw new RuntimeException("negative number not allowed: " + x + " " + y);
		return subtractor.subtract(x, y) * subtractor.subtract(x, y);
	}

}
