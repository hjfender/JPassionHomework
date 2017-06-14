package mypersoninterfaceproject2;

public class Person implements MyOwnInterface{

	int cashSaving;
	int retirementFund;
	String firstName;
	String lastName;
	AddressInterface address;
	
	public Person(int cashSaving,
				  int retirementFund,
				  String firstName,
				  String lastName,
				  AddressInterface address) {
		this.cashSaving = cashSaving;
		this.retirementFund = retirementFund;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	@Override
	public AddressInterface getAddress() {
		return address;
	}

	@Override
	public int computeTotalWealth() {
		return cashSaving + retirementFund;
	}

	@Override
	public String getName() {
		return firstName + " " + lastName;
	}

}
