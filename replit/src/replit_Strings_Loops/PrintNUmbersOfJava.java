package replit_Strings_Loops;

import java.util.Scanner;

public class PrintNUmbersOfJava {

	public static void main(String[] args) {
		 
		
		Scanner scan= new Scanner(System.in);
		    
		String word = scan.next();
		
		int counter=0;
		
		for (int i = 0; i < word.length(); i++) {
			
			if (word.contains("java")) {
				counter++;
				
				word=word.replaceFirst("java", "");
			}
		}
		System.out.println(counter);

	}

}



/*Print the number of times that the string "java" appears anywhere in the given string word

Example:

input: javaxjava

output: 2

Example:

input: javaxjavaapplepearjavaegg

output: 3*/