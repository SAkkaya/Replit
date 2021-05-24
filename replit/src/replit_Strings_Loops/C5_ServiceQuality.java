package replit_Strings_Loops;

import java.util.Scanner;

public class C5_ServiceQuality {

	public static void main(String[] args) {
		// WRITE YOUR CODE HERE
		Scanner sc = new Scanner(System.in);
		System.out.println("Split:");
		String inp1 = sc.next();
		System.out.println("Number of people:");
		int num = sc.nextInt();
		System.out.println("Check amount:");
		double amount = sc.nextDouble();
		System.out.println("Service Quality:");
		String quality = sc.next();

		System.out.println("Number of people entered: " + each(num));

		double totalTip = amount * qlty(quality);
		double pay = totalTip + amount;
		double totalPerPerson = pay / num;
		double tipPerPerson = totalTip / num;

		System.out.println("Total to pay: " + pay);
		System.out.println("Total tip: " + totalTip);
		System.out.println("Total per person: " + totalPerPerson);
		System.out.println("Tip per person: " + tipPerPerson);

	}
	/*
	 * public static void each(int num){ for(int i=1;i<=num;i++){
	 * System.out.print("&"); }
	 */

	public static String each(int num) {
		String result = "";
		for (int i = 1; i <= num; i++) {
			result += "&";
		}
		return result;
	}

	public static double qlty(String quality) {
		double d = 0;
		if (quality.equalsIgnoreCase("Poor")) {
			d = 0.05;
		} else if (quality.equalsIgnoreCase("Fair")) {
			d = 0.1;
		} else if (quality.equalsIgnoreCase("Good")) {
			d = 0.15;
		} else if (quality.equalsIgnoreCase("Great")) {
			d = 0.2;
		} else if (quality.equalsIgnoreCase("Excellent")) {
			d = 0.25;
		}
		return d;
	}

}

/*
Write a program for a tip calculator. There will be different service quality benchmarks that will determine the tip given. 
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not. 

> Poor = 5%
> Fair = 10%
> Good = 15%
> Great = 20%
> Excellent = 25% 

The program should display the following information based on the user input: 

Split or No split (Yes or No)
Number of people entered: (number) (each person = & in output)
Check amount: (number)
Service Quality: (String)
Total to pay:
Total tip:
Total per person:
Tip per person:

```
Example

Input:
Yes
4
476.0
Excellent

Output:
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
*/