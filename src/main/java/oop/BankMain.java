package oop;

public class BankMain {

	public static void main(String[] args) {

		BankAccounts acc1 = new BankAccounts("8745", 1500);
		BankAccounts acc2 = new BankAccounts("4526", 1200);
		BankAccounts acc3 = new BankAccounts("2346", 1001);
		acc1.setFirstName("Amogh");
		acc1.setLastName("Pradhan");
		acc2.setFirstName("Manisha");
		acc2.setLastName("Shrestha-Pradhan");
		acc1.showBalance();
		acc1.deposit(1500);
		acc1.payBill(500);
		acc1.deposit(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
		

	}
}

class BankAccounts implements IInterest {

	// properties of bank account
	private static int id = 1000; // internal ID
	private static final String routingNumber = "002345600";
	private String accountNumber; // account number = id + random 2 digit number
									// + first 2 ssn
	private String firstName;
	private String lastName;
	private String SSN;
	private double balance;

	// constructor
	public BankAccounts(String SSN, double initAmount) {
		balance = initAmount;
		this.SSN = SSN;
		id++;
		setAccountNumber();

	}

	// creating a account number
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100) ;
		accountNumber = id + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account number is: " + accountNumber);

	}

	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("The amount of $" + amount + " has been paid.");
		showBalance();
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("$" + amount + " has been added to our account.");
		showBalance();
	}

	public void showBalance() {
		System.out.println("Total Balance $" + balance);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;

	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public void accrue() {
		balance = balance * (1 + rate / 100);
		showBalance();
	}

	//@Override
	public String toString() {
		return "[ Name: " + firstName + " ]\n" + "[ Account Number: " + accountNumber + " ]\n" + "[ Routing Number: "
				+ routingNumber + " ]\n" + "[ Balance: " + balance + " ]";

	}

}
