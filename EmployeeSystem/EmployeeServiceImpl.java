package emp;

import java.util.Enumeration;
import java.util.Scanner;

public class EmployeeServiceImpl extends EmployeeService {
	Scanner scanner = new Scanner(System.in);

	@Override
	public void createEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee Details: ");
		
		System.out.println("Enter Id: ");
		String id = scanner.next();
		
		System.out.println("Enter First Name: ");
		String fName = scanner.next();
		
		System.out.println("Enter Last Name: ");
		String lName = scanner.next();
		
		System.out.println("Enter Email ID: ");
		String email = scanner.next();
		
		System.out.println("Enter Salary: ");
		String salary = scanner.next();
		
		Employee employee = new Employee(id, fName, lName, email, salary);
		
		employees.add(employee);
		
		System.out.println("Employee created Successfully....");
	}

	@Override
	public void displayEmployee() {
		// TODO Auto-generated method stub
		for (Employee employee : employees) {
            System.out.println(employee);
        }
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		Employee employee = null;
		
		System.out.println("Enter Employee ID to be Deleted: ");
		String id = scanner.next();
		
		Enumeration<Employee> emp = employees.elements();
		while (emp.hasMoreElements()) {
			employee = emp.nextElement();
			if(employee.getId().equals(id)) {
				employees.remove(employee);
				System.out.println("Employee Deleted Successfully...!");
			}
			else 
			{
				System.out.println("Employee ID not found... Try Again!");
			}
		}
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
Employee employee = null;
		
		System.out.println("Enter Employee ID to be Updated: ");
		String id1 = scanner.next();
		
		Enumeration<Employee> emp = employees.elements();
		while (emp.hasMoreElements()) {
			employee = emp.nextElement();
			if(employee.getId().equals(id1)) {
				
				System.out.println("Enter New Id: ");
				String newId = scanner.next();
				
				System.out.println("Enter New First Name: ");
				String newFName = scanner.next();
				
				System.out.println("Enter New Last Name: ");
				String newLName = scanner.next();
				
				System.out.println("Enter New Email ID: ");
				String newEmail = scanner.next();
				
				System.out.println("Enter New Salary: ");
				String newSalary = scanner.next();
				
				employee.setId(newId);
				employee.setFirstName(newFName);
				employee.setLastName(newLName);
				employee.setEmail(newEmail);
				employee.setSalary(newSalary);
				
				
				System.out.println("Employee Updated Successfully...."+employee);
			}
			else 
			{
				System.out.println("Employee ID not found... Try Again!");
			}
		}
	}
	
	
}
