package inteviewpractice;

public class Address {
	
	private String streetno;
	private String state;
	private String city;
	
	
	public String getStreetno() {
		return streetno;
	}
	public void setStreetno(String streetno) {
		this.streetno = streetno;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [streetno=" + streetno + ", state=" + state + ", city=" + city + "]";
	}
	
	

}
