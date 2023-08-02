package employeeFactory;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.UUID;
import java.util.Vector;

public class EmployeeFactory {

	private Scanner scanner = new Scanner(System.in);
	Vector<Employee> v = new Vector<Employee>();
	Employee e;
	
	public Employee createEmployee()
	{
		Employee emp = new Employee();
		System.out.print("Enter Employee Name: ");
		String eName=scanner.next();
		System.out.print("Enter Employee Salary: ");
		String eSalary=scanner.next();
		
		
		System.out.print("Enter Department Name: ");
		String dName = scanner.next();
		Department d=createDepartment(dName);
		emp.setDepartment(d);
		emp.setEmployeeID(UUID.randomUUID().toString());
		emp.setEmployeeName(eName);
		emp.setEmployeeSalary(eSalary);
		v.add(emp);
		return emp;
		
	}

	private Department createDepartment(String dName) {
		// TODO Auto-generated method stub
		Department d = new Department();
		System.out.print("Enter Employee City: ");
		String city = scanner.next();
		System.out.print("Enter Employee Zip Code: ");
		String zip = scanner.next();
		System.out.print("Enter Employee Country Name: ");
		String country = scanner.next();
		Location l = createLocation(city, zip, country);
		d.setDepartmentName(dName);
		d.setLocation(l);
		d.setDepartmentId(UUID.randomUUID().toString());
		return d;
	}

	private Location createLocation(String city, String zip, String country) {
		// TODO Auto-generated method stub
		Location l = new Location();
		l.setLocationId(UUID.randomUUID().toString());
		l.setCityName(city);
		l.setZipCode(zip);
		l.setCountryName(country);
		return l;
	}
	
	public void displayEmployee() {
		Enumeration<Employee> e1 = v.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
	}
}

	public void findEmployee(String id) {
		// TODO Auto-generated method stub
		Employee employee = null;
		Enumeration<Employee> e2 = v.elements();
		while(e2.hasMoreElements()) {
			employee =e2.nextElement();
			if(employee.getEmployeeID().equals(id)) {
				System.out.println("Employee Found...!\n" +employee);
			}
			else 
			{
				System.out.println("Employee Not Found...!\n");
			}
		}
	}

	public void removeEmployee(String removeName) {
		// TODO Auto-generated method stub
		Employee employee = null;
		Enumeration<Employee> e3 = v.elements();
		while(e3.hasMoreElements()) {
			employee = e3.nextElement();
			if(employee.getEmployeeName().equals(removeName)) {
				v.remove(employee);
				System.out.println("Employee Removed Successfully...!");
			}
			else
			{
				System.out.println("Employee not Found...Try Again!!");
			}
		}
		
	}

	public void updateEmployee(String updateId) {
		// TODO Auto-generated method stub
		Location l = new Location();
		Department d = new Department();
		Employee employee = null;
		Enumeration<Employee> e3 = v.elements();
		while(e3.hasMoreElements()) {
			employee = e3.nextElement();
			if(employee.getEmployeeName().equals(updateId)) {
				System.out.println("Enter new name: ");
				String newName = scanner.next();
				System.out.println("Enter new salary: ");
				String newSalary = scanner.next();
				System.out.println("Enter new department: ");
				String newDept = scanner.next();
				System.out.println("Enter new city: ");
				String newCity = scanner.next();
				System.out.println("Enter new zip code: ");
				String newZip = scanner.next();
				System.out.println("Enter new country: ");
				String newCountry = scanner.next();
				
				employee.setEmployeeName(newName);
				employee.setEmployeeSalary(newSalary);
				employee.setDepartment(d);
				d.setDepartmentName(newDept);
				d.setLocation(l);
				l.setCityName(newCity);
				l.setZipCode(newZip);
				l.setCountryName(newCountry);
				l.setLocationId(UUID.randomUUID().toString());
				d.setDepartmentId(UUID.randomUUID().toString());
				System.out.println("Employee Details Updated Successfully...");
			}
		}
	}
}
