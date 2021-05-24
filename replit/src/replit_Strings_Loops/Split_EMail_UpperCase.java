package replit_Strings_Loops;

import java.util.Scanner;

public class Split_EMail_UpperCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String email = scan.next();

		int i = email.indexOf("_");
		String firstName = email.substring(0, 1).toUpperCase().concat(email.substring(1, i));
		int j = email.indexOf("@");
		String lastName = email.substring(i + 1, i + 2).toUpperCase().concat(email.substring(i + 2, j));

		int k = email.indexOf(".");

		String domain = email.substring(j + 1, k);

		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Domain: " + domain);

	}
}