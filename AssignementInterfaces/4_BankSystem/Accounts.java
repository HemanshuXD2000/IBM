package bankInterfaces;

public interface Accounts {
	
	void deposit(double amount);
	void withdraw(double amount);
//	double calculateInterest();
//	void Overdraft();
	double getBalance();
}
