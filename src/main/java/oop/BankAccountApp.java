package oop;

public class BankAccountApp {

	public static void main(String[] args) {
	
		BankAccount account = new BankAccount();
		
		account.openBalance("saving", 3000);
		account.name = "Manisha Nakalee";
		account.accountNumber = 23476;
		account.SSN = 6789;
		account.accountType = "Checking";
		
		account.deposit(5000);
		account.deposit(5000);
		account.deposit(5000);
		account.withdraw(5000);
		
		account.setRate();
		account.increaseRate();
		System.out.println(account.toString());
		
//		BankAccount account1 = new BankAccount("Amogh Pradhan", "Checking Account");
//		account1.openBalance("Checking Account", 3000);
//	
//		account1.openBalance("Checking Account", 9999);
//		account1.balance();
	
		
		
		//BankAccount account2 = new BankAccount(23456);
		
	/*	BankAccount account3 = new BankAccount("Cheking Account", 7000);
		
		account3.balance();
		
		account3.deposit("Cheking Account",2000);

		account3.balance();
		*/
	}

}
