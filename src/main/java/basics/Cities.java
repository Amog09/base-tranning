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
		String[] states = new String[7];
		states[0] = "New York";
		states[1] = "New Jersey";
		states[2] = "Texas";
		states[3] = "Ohio";
		states[4] = "Colorado";
		states[5] = "Kathmandu";
		states[6] = "Las Vegas";

		int i = 0;
		// do loop: enters the loop then tests condition.
		do {
			System.out.println("States: " + states[i]);
			i = i + 1;
		} while (i < 7);
		System.out.println("*+*+*+*+*+*+*+*+*+*+*+*");
		// while loop; tests condition first then enters loop.
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.println("States " + n + ": " + state);
			if (state == "Kathmandu") {
				System.out.println("The state is Found!");
				System.out.println("I am going back.");				
				stateFound = true;
			}

			n++;
		}

		// for Loop: best structure to iterate through the array
		System.out.println("\nPrinting with loops");
		for (int a = 0; a < 7; a++) {
			System.out.println(states[a]);
		}

	}

}
