package bankInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Accounts> accounts;
	
	public Bank() {
		accounts = new ArrayList<>();
	}
	
	public void addAccount(Accounts addAccounts) {
		accounts.add(addAccounts);
		System.out.println("Account created Successfully...!");
	}
}
