package employeeFactory;

public class Department {
	
	private String departmentId;
	private String departmentName;
	private Location location;

	
	
	public Department(String departmentId, String departmentName, Location location) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.location = location;
	}



	public Department() {
		// TODO Auto-generated constructor stub
	}






	public String getDepartmentId() {
		return departmentId;
	}



	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}



	public String getDepartmentName() {
		return departmentName;
	}


public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}



	public Location getLocation() {
		return location;
	}



	public void setLocation(Location location) {
		this.location = location;
	}


@Override
	public String toString() {
		return "Id: " +departmentId+ " Name: " +departmentName+ "\n============================\nLocation: "+location;
	}
}
