package mypersoninterfaceproject2;

public class AddressImpl implements AddressInterface {

	int streetNumber;
	String streetName;
	String country;
	
	public AddressImpl(int streetNumber,
					   String streetName,
					   String country) {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.country = country;
	}
	
	@Override
	public int getStreetNumber() {
		return streetNumber;
	}

	@Override
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	@Override
	public String getStreetName() {
		return streetName;
	}

	@Override
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	@Override
	public String getCountry() {
		return country;
	}

	@Override
	public void setCountry(String country) {
		this.country = country;
	}

}
