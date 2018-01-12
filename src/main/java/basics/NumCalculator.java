package basics;

public class NumCalculator {

	public static void main(String[] args) {
		System.out.println("Program is starting...!!");
		printName();
		
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		System.out.println();
		int product = multiplyNumbers(numA, numB);
		System.out.println(product);
		System.out.println("The product of the "+numA+ " and " +numB+" is "+multiplyNumbers(numA, numB));
		
		
	}

	static void printName() {
		System.out.println("My name is Amogh.");

	}

	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println("The sum of "+ numberA+ " and "+ numberB +" is " + sum+" .");
	}
	
	static int multiplyNumbers(int firstNum, int secondNum){
		int product  = firstNum * secondNum;
		addNumbers(product+50, product);
		
		return product;
		
	}
}
