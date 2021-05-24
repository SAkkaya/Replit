package replit_Strings_Loops;

import java.util.Scanner;

public class C4_FirstCharacter {

	public static void main(String[] args) {
		// Write a program that will print out the first character of the word.
		
		Scanner scan = new Scanner(System.in);
	    
		System.out.println("enter your word");
		String word = scan.next();
		
		char firstchar =word.charAt(0);
		
		System.out.print(firstchar); // first character
		
		char lastchar=word.charAt(word.length()-1);
		System.out.print(lastchar); //last character
		

		System.out.println(""+firstchar+lastchar);
	}

}
