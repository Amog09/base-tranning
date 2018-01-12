package basics;

public class FactorialSum {
	public static void main(String[] args) {
		number(10);

	}

	public static int number(int j) {
		int sum = 0;
		for (int i = 0; i <= j; i++) {
			sum = sum + i;
			System.out.println("the sum of given factorial is " + sum);

		}
		return sum;
	}
}
