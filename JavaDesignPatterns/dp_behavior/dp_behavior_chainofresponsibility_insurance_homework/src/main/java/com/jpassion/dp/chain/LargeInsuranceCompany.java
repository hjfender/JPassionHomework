package com.jpassion.dp.chain;

public class LargeInsuranceCompany extends AbstractInsuranceRequestHandler {

	@Override
	public void handleRequest(InsuranceRequest request) {
		if(request.getAmount() < FOUR_HUNDRED){
			System.out.println("Large Insurance company will handle $" + request.getAmount());
		} else {
			this.successor.handleRequest(request);
		}
	}
}
