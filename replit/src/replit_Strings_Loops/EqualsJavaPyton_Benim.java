package replit_Strings_Loops;

import java.util.Scanner;

public class EqualsJavaPyton_Benim {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String sentence = scan.nextLine();
		    
		    
		    int counterJava=0;
		    int counterPython=0;
		    
		    
		    while(sentence.toLowerCase().contains("java")) {
				sentence=sentence.replaceFirst("java", "");
		    	counterJava++;
		    }
		   
		    while(sentence.toLowerCase().contains("python")) {
		    	
		    	sentence=sentence.replaceFirst("python", "");
				counterPython++;  
				
		    }
		   
			  System.out.println(counterJava);
			  System.out.println(counterPython);

		    
		    if (counterJava==counterPython) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		    
		    

	}

}



/*Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to 
the number of appearances of "python" anywhere in the string (case sensitive).
 

Example:

input: We study java not python
output: true

Example:

input: What's the difference between java, javascript and python?
output: false*/



