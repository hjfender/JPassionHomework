package com.jpassion.dp.chain;

public class SmallInsuranceCompany extends AbstractInsuranceRequestHandler {

	@Override
	public void handleRequest(InsuranceRequest request) {
		if(request.getAmount() < ONE_HUNDRED){
			System.out.println("Small Insurance company will handle $" + request.getAmount());
		} else {
			this.successor.handleRequest(request);
		}
	}

}
