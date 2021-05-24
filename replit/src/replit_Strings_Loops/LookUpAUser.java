package replit_Strings_Loops;

import java.util.Scanner;

public class LookUpAUser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter full name:");
		String user = scan.nextLine();
		
		if((user.equalsIgnoreCase("Max Payne")) ||(user.equalsIgnoreCase("Alan Wake"))) {
			System.out.println("User found!");
		}else {
			System.out.println("User not found!");
		}

	}

}
