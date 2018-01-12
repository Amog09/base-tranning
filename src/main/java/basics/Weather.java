package basics;

public class Weather {

	public static void main(String[] args) {
		// This program will give suggestions of what to wear based on the
		// weather (temperature).

		int temparature = 45;
		String sunCondition = "Overcast";

		if (temparature > 80) {
			System.out.println("Its pleasent, wear shorts and T-shirts.");
		} else if ((temparature > 60) && (sunCondition == "Sunny")) {
			System.out.println("Its a little coolder. Perhaps wear a long sleeve and jenas.");
			System.out.println("Also bring a hat if you hate the sun on your face.");

		}else if ((temparature >50) || (sunCondition == "Overcast")){
			System.out.println("This is a cooler day, make sure to wear a warm clothes.");
			
		}
		else {
			System.out.println("Looks like a cool day bring a sweater.");

		}
		System.out.println("the program is ending.......!!");
	}

}
