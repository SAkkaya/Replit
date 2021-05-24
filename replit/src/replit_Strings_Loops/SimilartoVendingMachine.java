package replit_Strings_Loops;

import java.util.Scanner;

public class SimilartoVendingMachine {

	public static void main(String[] args) {

		int giftCard = 100;
		int price = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Input: ");
		String item = scan.nextLine();

		switch (item) {
		case "Blanket":
			price = 60;
			break;
		case "Charger":
			price = 25;
			break;
		case "Hat":
			price = 25;
			break;
		case "Headphones":
			price = 30;
			break;
		case "Laptop":
			price = 200;
			break;
		case "Pants":
			price = 50;
			break;
		case "Pillow":
			price = 40;
			break;
		case "Smartphone":
			price = 1000;
			break;
		case "Socks":
			price = 60;
			break;
		case "USB cable":
			price = 10;
			break;
		default:
			System.out.println("Invalid item!");
			return;
		}

//		int Blanket = 60;
//		int Charger = 25;
//		int Hat = 25;
//		int Headphones = 25;
//		int Laptop = 200;
//		int Pants = 50;
//		int Pillow = 40;
//		int Smartphone = 1000;
//		int Socks = 5;
//		int USBcable = 10;

		
		
		int balance = giftCard - price;

		if ((price <= 100) && (price >0)) {
			System.out.println("Thank you for your purchase!");
			System.out.println("Your current balance is: " + balance + "$");
		} else {
			System.out.println("Sorry, not enough funds on your gift card!");
		} 

	}
}