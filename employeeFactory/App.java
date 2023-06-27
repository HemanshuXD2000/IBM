package employeeFactory;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class App {

	public static void main(String[] args) {
		Vector<Employee> v = new Vector<Employee>();
		Scanner scanner = new Scanner(System.in);
		EmployeeFactory factory = new EmployeeFactory();
		Employee e;

		int choice = 0;
		do {
			System.out.println("1. Create Employee...");
			System.out.println("2. Display Employee...");
			System.out.println("3. Find Employee by Id...");
			// System.out.println("4. Find Employee by Name...");
			System.out.println("4. Remove Employee...");
			System.out.println("0. Exit...");
			System.out.println("Enter Your Choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				e = factory.createEmployee();
				v.add(e);
				break;
			case 2:
				Enumeration<Employee> e1 = v.elements();
				while (e1.hasMoreElements()) {
					System.out.println(e1.nextElement());
				}
				break;

			case 3:
				System.out.println("Enter the employee Id to search: ");
				String searchId = scanner.next();
				int count = -1;
				// Employee foundEmployee = null;
				Enumeration<Employee> e2 = v.elements();
				while (e2.hasMoreElements()) {
					Employee employee = e2.nextElement();
					if (employee.getEmployeeId().equals(searchId)) {
						System.out.println("Found " + employee);
						count++;
						break;
					}
				}
				if (count < 0) {
					System.out.println("Not Found");
				}
				break;

			case 4:
				System.out.println("Enter the emplyee name to remove :");
				String removeName = scanner.next();
				boolean removed = false;
				Enumeration<Employee> e3 = v.elements();
				while (e3.hasMoreElements()) {
					Employee employee = e3.nextElement();
					if (employee.getEmployeeName().equals(removeName)) {
						v.remove(employee);
						removed = true;
						break;
					}
				}
				if (removed) {
					System.out.println("Employee Removed Successfully....");
				} else {
					System.out.println("Enployee not Found");
				}
				break;

			case 0:
				System.out.println("Bye...!");
				System.exit(1);
				break;
			default:
				System.out.println("Invalid Choice. Try Again!");
				break;
			}
		} while (choice != 0);
	}
}
