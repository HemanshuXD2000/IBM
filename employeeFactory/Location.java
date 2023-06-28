package employeeFactory;

public class Location {
	
	private String locationId;
	private String cityName;
	private String zipCode;
	private String countryName;
	
	

	public Location(String locationId, String cityName, String zipCode, String countryName) {
		super();
		this.locationId = locationId;
		this.cityName = cityName;
		this.zipCode = zipCode;
		this.countryName = countryName;
	}



	public Location() {
		// TODO Auto-generated constructor stub
	}



	public String getLocationId() {
		return locationId;
	}



	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}



	public String getCityName() {
		return cityName;
	}



	public void setCityName(String cityName) {
		this.cityName = cityName;
	}



	public String getZipCode() {
		return zipCode;
	}



	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}



	public String getCountryName() {
		return countryName;
	}



	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


@Override
	public String toString() {
		return "Id: "+locationId+ " City: " +cityName+ " Zip: "+zipCode+ " Country: "+countryName;
	}
	
}
