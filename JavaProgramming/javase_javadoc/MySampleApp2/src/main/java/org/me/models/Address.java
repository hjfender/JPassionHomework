package org.me.models;

/**
 * This class represents an Address of {@link Person} who owned a {@link Car}.
 * @author hefe002
 * @see Person
 * @see Car
 */
public class Address {
	private int number;
	private String street;
	private String state;
	
	/**
	 * Returns the address of the person
	 * @param p The person
	 * @return The address
	 */
	public String sayAddress(Person p){
		return state + " " + street + " " + number;
	}
}
