package com.jpassion.dp.chain;

public abstract class AbstractInsuranceRequestHandler {
	
	// Use the following constants as the amount of insurance claim
	protected static final double ONE_HUNDRED = 100.0;
	protected static final double TWO_HUNDRED = 200.0;
	protected static final double THREE_HUNDRED = 300.0;
	protected static final double FOUR_HUNDRED = 400.0;
	
	// TODO: Add successor field whose type is AbstractInsuranceRequestHandler
	protected AbstractInsuranceRequestHandler successor;
	
	// TODO: Add setter method for setting successor field
	public void setSuccessor(AbstractInsuranceRequestHandler successor){
		this.successor = successor;
	}

	// TODO: Add an abstract method for handling InsuranceRequest object
	public abstract void handleRequest(InsuranceRequest request);
	
}