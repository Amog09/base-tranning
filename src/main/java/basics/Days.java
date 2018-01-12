package basics;

public class Days {

	public static void main(String[] args) {
		// Execute a different block of code base on the value of condition..

		String dayOfWeek = "Saturday";

		switch (dayOfWeek) {
		case "Monday":
			System.out.println("Today is Monday, Its the beggining day of the week so dont have fun.");
			break;
		case "Tuesday":
			System.out.println("Today is Tuesday, so basicly revise Mondays work.");
			break;
		case "Wwednesday":
			System.out.println("Today is Wednesday, pick up grocery from store.");
			break;
		case "Thursday":
			System.out.println("Today is Thrusday, make sure you get ready for Friday night.");
			break;
		case "Friday":
			System.out.println("Today is Friday, make sure you finished all your work before heading out of office.");
			break;
		case "Saturday":
			System.out.println("Today is Saturday, go out with your dear wife.");
			break;
		case "Sunday":
			System.out.println("Today is Sunday, have a nice family time at home.");
			break;
		}

	}

}
