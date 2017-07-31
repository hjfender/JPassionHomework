package com.jpassion.dp.chain;

public class MediumInsuranceCompany extends AbstractInsuranceRequestHandler {

	@Override
	public void handleRequest(InsuranceRequest request) {
		if(request.getAmount() < TWO_HUNDRED){
			System.out.println("Medium Insurance company will handle $" + request.getAmount());
		} else {
			this.successor.handleRequest(request);
		}
	}

}
