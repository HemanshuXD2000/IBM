package employeeFactory;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EmployeeFactory factory = new EmployeeFactory();
				
		int choice = 0;
		
		do {
			System.out.println("1. Create Employee...");
			System.out.println("2. Display Employee...");
			System.out.println("3. Find Employee...");
			System.out.println("4. Remove Employee...");
			System.out.println("5. Update Employee...");
			System.out.println("0. Exit...");
			System.out.print("Enter Your Choice: ");
			choice = scanner.nextInt();
			
			switch(choice){
			
			case 1:
				factory.createEmployee();
				System.out.println("Employee Created... \n");
				break;
				
			case 2:
				factory.displayEmployee();
				break;
				
			case 3:
				System.out.println("Enter Employee Id to Search: ");
				String id = scanner.next();
				factory.findEmployee(id);
				break;
				
			case 4:
				System.out.println("Enter Employee Name to Remove: ");
				String removeName = scanner.next();
				factory.removeEmployee(removeName);
				break;
				
			case 5:
				System.out.println("Enter Employee Id to Update: ");
				String updateId = scanner.next();
				factory.updateEmployee(updateId);
				break;
				
			case 0:
				System.out.println("Bye...!");
				System.exit(1);
				break;
				
			default: 
				System.out.println("Invalid Choice...... Try Again!");
				break;
			}
			//scanner.close();
		}
		while(choice != 0);
}
}