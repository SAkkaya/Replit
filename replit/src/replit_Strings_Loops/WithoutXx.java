package replit_Strings_Loops;

import java.util.Scanner;

public class WithoutXx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		String first = word.substring(0, 1);
		String last = word.substring(word.length() - 1);
		if (first.equalsIgnoreCase("x") && last.equalsIgnoreCase("x")) {

			word = word.substring(1, word.length() - 1);
		} else {

			if (first.equalsIgnoreCase("x")) {
				word = word.substring(1);
			}
			if (last.equalsIgnoreCase("x")) {
				word = word.substring(0, word.length() - 1);
			}

		}

		System.out.println(word);
	}

}

/*
 * Given a string word, if the first or last chars are 'x' or 'X', print the
 * string without those 'x' or 'X' chars, otherwise print the string unchanged.
 * 
 * Example:
 * 
 * input: xHiX
 * output: Hi 

 * input: apple
 * output: apple 
 * 
 * input: xUxL
 * output: UxL 
 * 
 * input: JavaX
 * output: Java
 */