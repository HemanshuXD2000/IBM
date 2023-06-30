package project1;

public class Tester {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 15;
		int num3 = 7;
		int num4 = 12;
		
		int greatest = num1;
		
		if (num2 > greatest) {
			greatest = num2;
		}
		if (num3 > greatest) {
			greatest = num3;
		}
		if (num4 > greatest) {
			greatest = num4;
		}
		System.out.println("The greatest number is: " + greatest);
	}
}
