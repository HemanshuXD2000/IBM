package employeeFactory;

public class Employee {

	private String employeeId;
	private String employeeName;
	private int employeeSalary;
	private Department department;

	public Employee(String employeeId, String employeeName, int employeeSalary, Department department) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.department = department;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
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
		return "\n====================================\n\n====================================\nEmployee [employeeId="
				+ employeeId + ", employeeName=" + employeeName + ", employeeSalary=" + employeeSalary
				+ ",\n====================================\ndepartment=" + department + "]";
	}

}
