package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Paint";
		bookTitle = "Paint the Picture";

		if (bookTitle.contains(wordChoice)) {
			System.out.println("The Book Title contains the word " + wordChoice + ".");
		}

		String browser = "Micorsoft Edge";

		if (browser.equalsIgnoreCase("microsoft edge")) {
			System.out.println("The Browser is Microsoft Edge.");
		}

		String firstName = "Amogh";
		String lastName = "Pradhan";
		String SSN = "354736665";
		String[] name;

		// Print the initial and last four digit of the SSN.
		System.out.print(firstName.substring(0, 1) + " ");
		System.out.print(lastName.substring(0, 1) + "\t");
		System.out.print(SSN.substring(5) + "\n");
		System.out.println("There are " + SSN.length() + " digits in your SSN.");

		boolean pint = true;

		while (pint) {
			System.out.println("want more pint");
			if (pint) {
				pint = false;

			}
		}

	}

}
