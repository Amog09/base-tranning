package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define arrays

		String[] cities = { "New York", "San Francisco", "Miami", "Dallas" };
		System.out.println(cities[0]);
		for (String city : cities) {
			System.out.println(city);

		}
		System.out.println("*+*+*+*+*+*+*+*+*+*+*+*");
		String[] states = new String[5];
		states[0] = "New York";
		states[1] = "New Jersey";
		states[2] = "Texas";
		states[3] = "Ohio";
		states[4] = "Colorado";

		int i = 0;
		// do loop: enters the loop then tests condition.
		do {
			System.out.println("States: " + states[i]);
			i = i + 1;
		} while (i < 5);
		System.out.println("*+*+*+*+*+*+*+*+*+*+*+*");
		// while loop; tests condition first then enters loop.
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.println("States " + n + ": " + state);
			if (state == "Ohio") {
				System.out.println("The state is Found!");
				stateFound = true;
			}

			n++;
		}

		// for Loop: best structure to iterate through the array
		System.out.println("\nPrinting with loops");
		for (int a = 0; a < 5; a++) {
			System.out.println(states[a]);
		}

	}

}
