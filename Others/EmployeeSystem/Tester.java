package emp;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImpl();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
            System.out.println("1. Create Employee...");
            System.out.println("2. Display Employees...");
            System.out.println("3. Delete Employee...");
            System.out.println("4. Update Employee...");
            System.out.println("5. Exit...");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice) {
            
            case 1:
                employeeService.createEmployee();
                break;
                
            case 2:
                employeeService.displayEmployee();
                break;
                
            case 3:
                employeeService.deleteEmployee();
                break;
                
            case 4:
                employeeService.updateEmployee();
                break;
                
            case 5:
                System.out.println("GoodByeee!!!");
                System.exit(1);
                break;
                
            }
		}		
	}
}
