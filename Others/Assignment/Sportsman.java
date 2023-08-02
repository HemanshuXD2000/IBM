package project1;

class Sportsman extends Person{
	private String sports;
	private int salary;
	public Sportsman(String name, int age, String sports) {
		super(name, age);
		this.sports = sports;
	}
	
	public void calculateSalary() {
		salary = 10000;
	}
	public void displayInfo() {
		super.displayInfo();
			System.out.println("Sports: "+sports);
			System.out.println("Salary: Rs." +salary);
		}
	}