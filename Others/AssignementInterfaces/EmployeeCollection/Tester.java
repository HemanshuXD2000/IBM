package project2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class Tester {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		EmployeeService employeeService = null;
		Collection<Employee> employees = null;
		
		System.out.println("Select the type of Storage: ");
		System.out.println("1. Set");
		System.out.println("2. List");
		System.out.print("Enter your choice: ");
		int choice = scanner.nextInt();
		
		switch(choice) {
			case 1:
				employees = new HashSet<>();
				employeeService = new EmployeeServiceImpl(employees);
				break;
				
			case 2:
				employees = new ArrayList<>();
				employeeService = new EmployeeServiceImpl(employees);
				break;
				
			default :
				System.out.println("Invalid Choice. Exiting....");
				System.exit(0);
		}
		
		while(true) {
			 System.out.println("1. Add Employee...");
	         System.out.println("2. Show Employees...");
	         System.out.println("3. Find Employee...");
	         System.out.println("4. Exit...");
	            
	         System.out.print("Enter your choice: ");
	         choice = scanner.nextInt();
	         scanner.nextLine();
	         
	         switch (choice) {
			case 1: {
				employeeService.createEmployee();
				break;
			}
			case 2: {
				employeeService.getAllEmployees();
				break;
			}
			case 3: {
				employeeService.findEmployeeById();
				break;
			}
			case 4:{
				 System.out.println("GoodByeee!!!");
	             System.exit(1);
	             break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			} 
		}
		
	}
}
