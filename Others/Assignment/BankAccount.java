package project1;

public class BankAccount {
	private int accountNumber;
	private double balance;
	
	public BankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: Rs." +amount);
		
	}
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: Rs." +amount);
		}
		else
		{
			System.out.println("Insufficient balance. Withdrawal Failed..!");
			
		}
	}
	public double getBalance() {
		return balance;
	}
	
}
