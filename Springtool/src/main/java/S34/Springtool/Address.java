package S34.Springtool;

public class Address {
	 String street, city;
	  
	  public Address() {
	    
	  }

	  public String getStreet() {
	    return street;
	  }

	  public void setStreet(String street) {
	    this.street = street;
	  }

	  public String getCity() {
	    return city;
	  }

	  public void setCity(String city) {
	    this.city = city;
	  }
	  
	  public String toString() {
	    return (street + " - " + city);
	  }
}
