public class Address {
	private int addressId;
	private int postcode;
	private String city;
	private String streetName;
	private int streetNum;
	private int unitNum;

	public Address(int addressId, int postcode, String city, String streetName, int streetNum, int unitNum){
		this.addressId = addressId;
		this.postcode = postcode;
		this.city = city;
		this.streetName = streetName;
		this.streetNum = streetNum;
		this.unitNum = unitNum;
	}

	public Address(int addressId, int postcode, String city, String streetName, int streetNum) {
		this.addressId = addressId;
		this.postcode = postcode;
		this.city = city;
		this.streetName = streetName;
		this.streetNum = streetNum;
		this.unitNum = 0;
	}

	// addressid
	public int getId() {
		return addressId;
	}

	public boolean setId(int input) {
		this.addressId = input;
		return true;
	}

	// postcode
	public int getPostcode() {
		return postcode;
	}

	public boolean setPostcode(int input) {
		this.postcode = input;
		return true;
	}

	// city
	public String getCity() {
		return city;
	}

	public boolean setCity(String input) {
		this.city = input;
		return true;
	}

	// streetName
	public String getStreet() {
		return streetName;
	}

	public boolean setStreet(String input) {
		this.streetName = input;
		return true;
	}

	// streetNum
	public int getStreetNum() {
		return streetNum;
	}

	public boolean setStreetNum(int input) {
		this.streetNum = input;
		return true;
	}

	// unitNum
	public int getUnitNum() {
		return unitNum;
	}

	public boolean setUnitNum(int input) {
		this.unitNum = input;
		return true;
	}

	public boolean equals(Object check) {
		if(this == check) {
			return true;
		}
		else if(check == null || getClass() != check.getClass()) {
			return false;
		}
		else {
			// int addressId, int postcode, String city, String streetName, int streetNum, int unitNum
			Address addrCheck = (Address) check;
			if(addressId == addrCheck.getId() && postcode == addrCheck.getPostcode() && city.equals(addrCheck.getCity()) && streetName.equals(addrCheck.getStreet()) && streetNum == addrCheck.getStreetNum() && unitNum == addrCheck.getUnitNum()) {
				return true;
			}
			else {
				return false;
			}
		}

	}
}
