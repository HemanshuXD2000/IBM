package employeeProject;

public class Department {
	private String departmentId;
	private String departmentName;
	Location location;
	
		
	
	public Department(String departmentId, String departmentName, Location location) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.location = location;
	}

	void createDepartment (String id, String name, Location tempLocation) {
		departmentId = id;
		departmentName = name;
		location=tempLocation;
	}

	public String getDetails() {
		
		//return "this is demo department....";
		return "Id: "+departmentId+ "Name: " +departmentName+ " \nLocation: "+location.getDetails();
		
	}
}
