package project2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
	
	private Collection<Employee> employees;
	Scanner scanner;
	
	public EmployeeServiceImpl(Collection<Employee> employees) {
        this.employees = employees;
        scanner = new Scanner(System.in);
    }
	
	@Override
	public void createEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee Details.");
		System.out.println("Enter employee ID: ");
		int id = scanner.nextInt();
		System.out.println("Enter First Name: ");
		String fname = scanner.next();
		System.out.println("Enter Last Name: ");
		String lname = scanner.next();
		System.out.println("Enter Email: ");
		String email = scanner.next();
		Employee emp = new Employee(id, fname, lname, email);
		employees.add(emp);
		System.out.println("Employee Added Successfully...!");
	}

	@Override
	public void getAllEmployees() {
		// TODO Auto-generated method stub
		Iterator<Employee> itr = employees.iterator();
		System.out.println("\n\nAll Employees: ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	@Override
	public void findEmployeeById() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee Id to search: ");
		int idSearch = scanner.nextInt();
		boolean found = false;
		Employee employee = null;
		for(Employee e : employees) {
			if(e.getEmployeeId()==idSearch) {
				employee = e;
				System.out.println("Found: "+employee);
				found=true;
				break;
			}
		}
		if (!found) {
            System.out.println("Employee not found.");
        }
	}

}
