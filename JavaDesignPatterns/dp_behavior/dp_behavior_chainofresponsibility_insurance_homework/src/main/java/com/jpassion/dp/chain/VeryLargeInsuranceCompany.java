package com.jpassion.dp.chain;

public class VeryLargeInsuranceCompany extends AbstractInsuranceRequestHandler {

	@Override
	public void handleRequest(InsuranceRequest request) {
		System.out.println("Very Large Insurance company will handle $" + request.getAmount());
	}

}
