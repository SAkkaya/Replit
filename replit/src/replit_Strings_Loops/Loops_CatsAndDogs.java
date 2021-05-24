package replit_Strings_Loops;

import java.util.Scanner;

public class Loops_CatsAndDogs {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
	    int countOfCats = 0;
	    int countOfDogs = 0;
	    //System.out.println("your word");
	    String word = scan.next();
	    
	    for (int i = 0; i < word.length(); i++) {
			
	
	    if (word.contains("cat")) {
			countOfCats++;
			word=word.replaceFirst("cat","");
		} 
	    
	    if (word.contains("dog")) {
			countOfDogs++;
			word=word.replaceFirst("dog","");
		}
	    
	    
	    }
	    if (countOfCats==countOfDogs) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	    
	  }
	
	
	
	}

/*Print true if the string "cat" and "dog" appear the same number of times in the given string word.

Example:

input: catdog
output: true
Example:

input: catcat
output: false
Example:

input: cat-cheetah-dog-cat
output: false*/

