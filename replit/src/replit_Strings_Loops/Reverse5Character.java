package replit_Strings_Loops;

import java.util.Scanner;

public class Reverse5Character {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    scan.close();
	 
	    if(word.length()<5) {
	    	  System.out.print("Too short!");
	    }else if(word.length()>5) {
	    	System.out.print("Too long!");
	    }else {
	    	System.out.print(reverse(word));
	    }
	    

	}

	public static String reverse(String str) {
		String output="";
		
		
		for (int i = str.length() - 1; i >= 0; i--) {
			output+=str.charAt(i);
			
		}return output;
		
	}

}


/*Write a program that will reverse a string. Your program should reverse a string _only 5 characters long_. 
If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console. 

Example:

```
input: cat

output: Too short!
```

```
input: singularity

output: Too long!
```
```
input: apple

output: elppa
``` */