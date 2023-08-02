package emp;

import java.util.Vector;

public abstract class EmployeeService {
	
	protected Vector<Employee> employees;
	
	public EmployeeService() {
		employees = new Vector<>();
	}
	
	public abstract void createEmployee();
	
	public abstract void displayEmployee();
	
	public abstract void deleteEmployee();
	
	public abstract void updateEmployee();
}
