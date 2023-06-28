package employeeFactory;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the annual income: ");
        double income = scanner.nextDouble();

        double tax = calculateIncomeTax(income);

        System.out.println("Income Tax is: Rs. " + tax);
    }

    public static double calculateIncomeTax(double income) {
        double tax = 0;

        if (income <= 50000) {
            tax = 0;
        } else if (income <= 60000) {
            tax = (income - 50000) * 0.1;
        } else if (income <= 150000) {
            tax = 10000 + (income - 60000) * 0.2;
        } else {
            tax = 31000 + (income - 150000) * 0.3;
        }

        return tax;
    }
}

