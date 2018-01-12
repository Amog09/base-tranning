package basics;

public class FactorialFunc {

	public static void main(String[] args) {

		System.out.println("Factorial: "+add(4));

	}

	public static int add(int n) {
		int fact = 0;

		if (n == 0) {
			return 1;

		} else {
			fact = add(n - 1) * n;
			
		}
		System.out.println(n);
		return fact;

	}
}