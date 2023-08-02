package project1;

public class PersonExample {
    public static void main(String[] args) {
        Politician politician = new Politician("John Doe", 40, 10);
        politician.calculateSalary();
        politician.displayInfo();

        System.out.println();

        Sportsman sportsman = new Sportsman("Jane Smith", 25, "Tennis");
        sportsman.calculateSalary();
        sportsman.displayInfo();
    }
}