package replit_Strings_Loops;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();
		// YOUR CODE HERE
		
		

		System.out.print(reverse(word1 + reverse(word1) + reverse(word2) + word2));

	}

	public static String reverse(String str) {
		String output="";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			output+=str.charAt(i);
			
		}return output;
		
	}

}