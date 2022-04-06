import java.util.Scanner;
import java.util.ArrayList;

public class CurrencyConverter {

	public static void main(String[] args) {
		// Create scanner object
		Scanner scan = new Scanner(System.in);
		int selection = scan.nextInt();

		// Create history arraylist
		ArrayList<String> history = new ArrayList<String>();

		// Give list of options in terminal
		System.out.println("Choose from the following options: ");
		System.out.println("1. USD to Euros");
		System.out.println("2. Euros to USD");
		System.out.println("3. Pounds to USD");
		System.out.println("4. USD to Yen");
		System.out.println("5. Print history");

		while (selection < 5)
		{
			// Switch case for each option
			switch (selection) {
				case 1: {
					System.out.println("Enter the number of USD:");
					
					// Get input and calculate the conversion
					double usd = scan.nextDouble();
					double euro = usd * 0.920;
					// Set values to strings
					String susd = String.valueOf(usd);
					String seuro = String.valueOf(euro);

					if (usd >= 0) {
						// Formats the string and prints the answer
						String answer = String.format("%1$s USD is %2$s Euros.", susd, seuro);
						System.out.println(answer);
						// Adds answer to our list
						history.add(answer);
					}
					else {
						System.out.println("Please put in a positive number of USD.");
					}
				}
				break;
				case 2: {
					System.out.println("Enter the number of Euros: ");
					// Get input and calculate the conversion
					double usd = scan.nextDouble();
					double euro = usd * 1.090;
					// Set values to strings
					String susd = String.valueOf(usd);
					String seuro = String.valueOf(euro);

					if (euro >= 0) {
						// Formats the string and prints the answer
						String answer = String.format("%1$s Euros is %2$s USD.", susd, seuro);
						System.out.println(answer);
						// Adds answer to our list
						history.add(answer);
					}
					else {
						System.out.println("Please put in a positive number of Euros.");
					}
				}
				break;
				case 3: {
					System.out.println("Enter the number of Pounds");
					// Get input and calculate the conversion
					double usd = scan.nextDouble();
					double pounds = usd * 0.760;
					// Set values to strings
					String susd = String.valueOf(usd);
					String spound = String.valueOf(pounds);

					if (pounds >= 0) {
						// Formats the string and prints the answer
						String answer = String.format("%1$s USD is %2$s Pounds.", susd, spound);
						System.out.println(answer);
						// Adds answer to our list
						history.add(answer);
					}
					else {
						System.out.println("Please put in a positive number of Pounds.");
					}
				}
				break;
				case 4: {
					System.out.println("Enter the number of Yen");
					// Get input and calculate the conversion
					double usd = scan.nextDouble();
					double yen = usd * 123.910;
					// Set values to strings
					String susd = String.valueOf(usd);
					String syen = String.valueOf(yen);

					if (yen >= 0) {
						// Formats the string and prints the answer
						String answer = String.format("%1$s USD is %2$s Yen.", susd, syen);
						System.out.println(answer);
						// Adds answer to our list
						history.add(answer);
					}
					else {
						System.out.println("Please put in a positive number of Yen.");
					}
				}
				break;
				case 5: {
					System.out.println(history);
				}
			}
			// Give list of options in terminal
			System.out.println("Choose from the following options: ");
			System.out.println("1. USD to Euros");
			System.out.println("2. Euros to USD");
			System.out.println("3. Pounds to USD");
			System.out.println("4. USD to Yen");
			System.out.println("5. Print history");
			selection = scan.nextInt();
		
		}
	}
}
