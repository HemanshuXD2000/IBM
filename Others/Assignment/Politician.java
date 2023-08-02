package project1;

class Politician extends Person{
	
	private int politicalExp;
	private int salary;

	public Politician(String name, int age, int politicalExp) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.politicalExp = politicalExp;
	}
	public void calculateSalary() {
		salary = 1000+politicalExp*500;
	}
	public void displayInfo(){
		super.displayInfo();
		System.out.println("Political Expericance: "+ politicalExp +" years");
		System.out.println("Salary: Rs." +salary);
	}
}