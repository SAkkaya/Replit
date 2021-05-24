package replit_Strings_Loops;

import java.util.Scanner;

public class Split_EMail_UpperCase_WithArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String email = scan.next();

		String[] arr = email.split("_");
		String surname = arr[1].split("@")[0];
		String mail = arr[1].split(surname)[1];
		String name = arr[0];

		// String domain=arr[1].split(".")[2];
		// System.out.println(domain);

		System.out.println("First name: " + name.substring(0, 1).toUpperCase() + name.substring(1));
		System.out.println("Last name: " + surname.substring(0, 1).toUpperCase() + surname.substring(1));
		System.out.println("Domain: " + mail.replace(".com", "").replace("@", ""));

	}
}