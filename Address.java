
public class Address {
	private String city;
	private int pincode;
	private String state;
	private String StreetNo;
	
	public Address(String city, int pincode, String state, String streetNo) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		StreetNo = streetNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreetNo() {
		return StreetNo;
	}

	public void setStreetNo(String streetNo) {
		StreetNo = streetNo;
	}
	
	
	

}
