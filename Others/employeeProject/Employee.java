package employeeProject;

public class Employee {
private String employeeName;
private String employeeId;
private int employeeSalary;
Department department;



public Employee(String employeeName, String employeeId, int employeeSalary, Department department) {
	super();
	this.employeeName = employeeName;
	this.employeeId = employeeId;
	this.employeeSalary = employeeSalary;
	this.department = department;
}
void createEmployee(String id, String name, int salary, Department tempDepartment)
{
	employeeId=id;
	employeeName=name;
	if(salary<1000) {
		employeeSalary = 1000;
	}
	else {
		employeeSalary=salary;
	}
		department=tempDepartment;
}
String getDetails() {
	return "Name: "+employeeName+" ID: "+employeeId+" Salary: "+employeeSalary+ "\nDepartment: "+department.getDetails();
}
}
