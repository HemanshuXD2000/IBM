package employeeFactory;

public class Employee {
	private String employeeID;
	private String employeeName;
	private String employeeSalary;
	private Department department;
	
	
	
	//String employeeID, String employeeName, String employeeSalary, Department department
	public Employee() {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.department = department;
	}

	



	public String getEmployeeID() {
		return employeeID;
	}





	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}





	public String getEmployeeName() {
		return employeeName;
	}





	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}





	public String getEmployeeSalary() {
		return employeeSalary;
	}





	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}





	public Department getDepartment() {
		return department;
	}





	public void setDepartment(Department department) {
		this.department = department;
	}




@Override
	public String toString() {
		return "Id: "+employeeID+ " Name:" +employeeName+ " Salary: " +employeeSalary+ "\n============================\nDepartment: " +department;
		
			
	}
}
