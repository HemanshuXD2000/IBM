package bankInterfaces;

public class CurrentAccount implements Accounts {
	
	private double balance;
	
	public CurrentAccount(double intialBalance) {
		this.balance = intialBalance;
	}

	
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance +=amount;
		System.out.println("Deposit successful. New balance: " + balance);
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Current balance: " + balance);
		return balance;
	}
	
	public void Overdraft() {
        System.out.println("Overdraft facility active for current account.");
    }

}
