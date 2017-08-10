package mypackage;

import java.util.function.Function;

class Main {

	public static void main(String[] args) {

		// Functions without composition
		// Function<Person, Address> personToAddressFunction = (person) -> person.getAddress();
		Function<Person, Address> personToAddressFunction = Person::getAddress;
		// Function<Address, String> addressToCountryFunction = (address) -> address.getCountry();
		Function<Address, String> addressToCountryFunction = Address::getCountry;
		Address address = personToAddressFunction.apply(new Person("Sang",
				new Address("Korea")));
		String country = addressToCountryFunction.apply(address);
		System.out.println("Country = " + country);

		// Functions with "andThen" composition
		Function<Person, String> personToCountryFunction1 = personToAddressFunction
				.andThen(addressToCountryFunction);
		country = personToCountryFunction1.apply(new Person("Jon",
				new Address("USA")));
		System.out.println("Country = " + country);

		// Functions with "compose" composition
		Function<Person, String> personToCountryFunction2 = addressToCountryFunction
				.compose(personToAddressFunction);
		country = personToCountryFunction2.apply(new Person("Jon",
				new Address("China")));
		System.out.println("Country = " + country);

		// <For your own exercise>
		// - Create another Function called "computeLengthFunction", 
		//   which returns number of characters from a String
		// - Apply "computeLengthFunction" Function to "addressToCountryFunction" using 
		//  "andThen" and then "compose"
		Function<String, Integer> computeLengthFunction = String::length;
		Function<Address, Integer> length1 = addressToCountryFunction.andThen(computeLengthFunction);
		Function<Address, Integer> length2 = computeLengthFunction.compose(addressToCountryFunction);
		
		System.out.println("Length = " + length1.apply(new Address("Spain")));
		System.out.println("Length = " + length2.apply(new Address("Costa Rica")));

	}

}

class Address {

	private String country;

	public Address(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}
}

class Person {

	private String name;
	private Address address;

	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
}
