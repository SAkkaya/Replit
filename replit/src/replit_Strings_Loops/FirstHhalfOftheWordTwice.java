package replit_Strings_Loops;

import java.util.Scanner;

public class FirstHhalfOftheWordTwice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	 
	    int halfLength=word.length()/2;
	    
	    //System.out.println(halfLength);
	    
	    String output=(word.substring(0, halfLength)+ word.substring(0,  halfLength));
	    System.out.println(output);
	    
	
	    
	    
	    

	}

}


/*
Write a program that will print out first half of the word twice. 


Example:

```
input: java

output: jaja
```
```
input: unity

output: unun
```*/