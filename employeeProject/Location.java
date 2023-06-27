package employeeProject;

public class Location {
	
	private String loactionId;
	private String city;
	private String zipcode;
	private String countryName;
	
	

	public Location(String loactionId, String city, String zipcode, String countryName) {
		super();
		this.loactionId = loactionId;
		this.city = city;
		this.zipcode = zipcode;
		this.countryName = countryName;
	}

	void createLocation(String id, String cityname, String zip, String country) {
		loactionId = id;
		city = cityname;
		zipcode = zip;
		countryName = country;
		
	}


	public String getDetails() {
		// TODO Auto-generated method stub
		return "Id: " +loactionId+ " City: " +city+ " Zip: "+zipcode+ " Country: " +countryName;
	}	

}
