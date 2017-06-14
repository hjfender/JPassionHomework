package mypersoninterfaceproject2;

public class Main {

	public static void main(String[] args) {
		
		AddressInterface addressObj = new AddressImpl(1600, "Grand Avenue", "United States of America");
		MyOwnInterface personObj = new Person(10000, 20000, "Sang", "Shin", addressObj);
		
		System.out.println("personObj.getName() = " + personObj.getName() + "\n" + 
						   "personObj.computeTotalWealth() = " + personObj.computeTotalWealth() + "\n" +
						   "personObj.getAddress().getStreetNumber() = " + personObj.getAddress().getStreetNumber() + "\n" +
						   "personObj.getAddress().getStreetName() = " + personObj.getAddress().getStreetName() + "\n" +
						   "personObj.getAddress().getCountry() = " + personObj.getAddress().getCountry());
		
	}
}
