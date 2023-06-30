package bankInterfaces;

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		//Saving Account
		Accounts savingAccounts = new SavingAccount(5000);
		bank.addAccount(savingAccounts);
		savingAccounts.deposit(1000);
		savingAccounts.withdraw(1500);
		//bank.calculateInterest();
		savingAccounts.getBalance();
		
		//Current Account
		Accounts currentAccounts = new CurrentAccount(10000);
		bank.addAccount(currentAccounts);
		currentAccounts.deposit(5000);
		currentAccounts.withdraw(8000);
		//currentAccounts.Overdraft();
		currentAccounts.getBalance();
	}
}
