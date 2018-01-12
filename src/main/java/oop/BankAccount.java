package oop;

public class BankAccount implements IRate{
	int accountNumber;
	double amount;
	String name;
	int SSN;
	String accountType;
	double balance = 0;
	private static final int routingNumber = 02367;


	public BankAccount() {
		System.out.println("The account has been created.");
	}

	public BankAccount(int accountNumber) {
		System.out.println("Bank account with the account number has been created." + accountNumber);

	}

	public BankAccount(String name, String accountType) {
		System.out.println(name + " has created a " + accountType + ".");

	}

	public BankAccount(String accountType, double initDeposit) {
		openBalance(accountType, initDeposit);

	}

	void openBalance(String accountType, double initDeposit) {
		if (initDeposit < 1000) {
			System.out.println("The min amount for deposit is $1000");
		} else {
			System.out.println("The amount of " + initDeposit + " has been deposited. Thank you!!");
			balance = balance + initDeposit;
			System.out.println("The total Balance in your " + accountType + " is " + balance);
		}

	}

	void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit of $" + amount);
	}

	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("Withdrawwal of $" + amount);
		
	}

	void balance() {
		System.out.println("Balance: " + balance);
	}

	private void showActivity(String activity) {
		System.out.println("Your recent transaction: " + activity);
		System.out.println("Your New Balance: $" + balance);
	}

	@Override
	public String toString() {
		return "[ Name: " + name + ", Account Number: " + accountNumber + ", Social: " + SSN + ", Routing Number: "
				+ routingNumber + ", Total balance: " + balance + "]";
	}

	@Override
	public int setRate() {
		System.out.println("The rate has been fixed.");
		return 0;
	}

	@Override
	public int increaseRate() {
		System.out.println("The rate has been increased by 3%.");
		return 0;
	}
}
