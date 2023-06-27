package employeeProject;

import java.util.UUID;

public class App {

	public static void main(String[] args) {
		Employee employee = new Employee("John Doe",UUID.randomUUID().toString(),35000,new Department(UUID.randomUUID().toString(),"Sales",new Location(UUID.randomUUID().toString(), "Nagpur", "440023", "India")));
		
		System.out.println(employee.getDetails());
	}
}
