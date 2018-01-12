package basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		// Declare a variable to define your carrer

		String career;
		System.out.println("Program is starting..");
		career = "Software Developer";
		System.out.println("My Career: " + career);

		// Decalre and Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;

		// Computer our annual salary

		double salary = hoursPerWeek + weeksPerYear + rate;
		System.out.println("My annual as " + career + " at a rate of $" + rate + " per year is" + salary + " per year. ");
	}

}
