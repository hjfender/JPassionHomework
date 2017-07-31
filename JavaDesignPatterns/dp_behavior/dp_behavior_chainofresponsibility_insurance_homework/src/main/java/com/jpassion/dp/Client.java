package com.jpassion.dp;

import com.jpassion.dp.chain.AbstractInsuranceRequestHandler;
import com.jpassion.dp.chain.LargeInsuranceCompany;
import com.jpassion.dp.chain.MediumInsuranceCompany;
import com.jpassion.dp.chain.SmallInsuranceCompany;
import com.jpassion.dp.chain.VeryLargeInsuranceCompany;
import com.jpassion.dp.chain.InsuranceRequest;

// TODO (Homework): Build a insurance claim handling
// system using Chain of Responsibility design pattern, in which
// small insurance company handles small claims while it 
// passes medium and large insurance claims over to medium
// and large insurance companies.

// <Steps to follow>
// 0. Uncomment the client code below
// 1. Create AbstractInsuranceRequestHandler class (provided with skeleton
//    code), which is an abstract class.
// 2. Create SmallInsuranceCompany, MediumInsuranceCompany, LargeInsuranceCompany
//    classes, which extend AbstractInsuranceRequestHandler abstract class
//
// <Optional steps>
// 3. Create VeryLargeInsuranceCompany, which handles insurance claim over $400,
//    and modify client code accordingly

// Running the application results in the output as following:
//
// Small Insurance company will handle $50.0
// Medium Insurance company will handle $150.0
// Large Insurance company will handle $250.0


class Client {
	
	public static void main(String[] args) {

		// Initialization and configuration
		AbstractInsuranceRequestHandler smallInsuranceCompany = new SmallInsuranceCompany();
		AbstractInsuranceRequestHandler mediumInsuranceCompany = new MediumInsuranceCompany();
		AbstractInsuranceRequestHandler largeInsuranceCompany = new LargeInsuranceCompany();
		AbstractInsuranceRequestHandler veryLargeInsuranceCompany = new VeryLargeInsuranceCompany();
		smallInsuranceCompany.setSuccessor(mediumInsuranceCompany);
		mediumInsuranceCompany.setSuccessor(largeInsuranceCompany);
		largeInsuranceCompany.setSuccessor(veryLargeInsuranceCompany);

		// Business logic
		smallInsuranceCompany.handleRequest(new InsuranceRequest(50.0));
		smallInsuranceCompany.handleRequest(new InsuranceRequest(150.0));
		smallInsuranceCompany.handleRequest(new InsuranceRequest(250.0));
		smallInsuranceCompany.handleRequest(new InsuranceRequest(511.13));
		
	}
}
