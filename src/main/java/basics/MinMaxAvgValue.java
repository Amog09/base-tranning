package basics;

public class MinMaxAvgValue {

	public static void main(String[] args) {

		int[] num2 = { 12, 34, 95, 78, 56, 789, 2 };
		System.out.println("Maximum " + findMax(num2));
		System.out.println("Minimum " + findMin(num2));
		System.out.println("Average " + findAvg(num2));

	}

	public static int findMax(int[] num) {
		int max = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}

		}
		return max;
	}

	public static int findMin(int[] num) {
		int max = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] < max) {
				max = num[i];
			}
		}

		return max;
	}

	public static int findAvg(int[] num) {

		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println("The sum of the given arrays: " + sum);
		return sum / num.length;
	}

}
