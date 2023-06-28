package project1;

import java.util.Scanner;

public class BankDatabase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankAccount account = new BankAccount(12345, 500.0);
		
		System.out.println("----Bank Database----");
		System.out.println("1. Deposit....");
		System.out.println("2. Withdraw....");
		System.out.println("3. Check Balance....");
		System.out.println("4. Exit....");
	
		boolean exit = false;
		
		while(!exit) {
			System.out.print("Enter Your Choice: ");
			int choice = scanner.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("Enter amount to deposit: ");
					double depositAmount = scanner.nextDouble();
					account.deposit(depositAmount);
					break;
				case 2:
					System.out.println("Enter amount to Withdraw: ");
					double withdrawAmount = scanner.nextDouble();
					account.deposit(withdrawAmount);
					break;
				case 3:
					double balance = account.getBalance();
					System.out.println("Current Balance: Rs." +balance);
					break;
				case 4:
					exit = true;
					break;
				default:
						System.out.println("Invalid choice. Please try again!!!");
						break;
			}
		}
	}
}
