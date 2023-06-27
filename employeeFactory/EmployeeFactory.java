package employeeFactory;

import java.util.Scanner;
import java.util.UUID;

public class EmployeeFactory {

	private Scanner scanner = new Scanner(System.in);

	public Employee createEmployee() {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		System.out.print("Enter Employee Name: ");
		String eName = scanner.next();
		System.out.print("Enter Employee Salary: ");
		int eSalary = scanner.nextInt();

		System.out.print("Enter Department Name: ");
		String dName = scanner.next();
		Department d = createDepartment(dName);
		emp.setDepartment(d);
		emp.setEmployeeId(UUID.randomUUID().toString());
		emp.setEmployeeName(eName);
		emp.setEmployeeSalary(eSalary);
		return emp;
	}

	private Department createDepartment(String departmentName) {
		// TODO Auto-generated method stub
		Department d = new Department();
		System.out.print("Enter Employee City: ");
		String city = scanner.next();
		System.out.print("Enter Employee Zip Code: ");
		String zip = scanner.next();
		System.out.print("Enter Employee Country: ");
		String country = scanner.next();
		Location l = createLocation(city, zip, country);
		d.setDepartmentId(UUID.randomUUID().toString());
		d.setDepartmentName(departmentName);
		d.setLocation(l);
		return d;
	}

	private Location createLocation(String city, String zip, String country) {
		// TODO Auto-generated method stub
		Location l = new Location();
		l.setLocationId(UUID.randomUUID().toString());
		l.setCityName(city);
		l.setCountryName(country);
		l.setZipCode(zip);
		return l;
	}

}
