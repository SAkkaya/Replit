package replit_Strings_Loops;

import java.util.Scanner;

public class Party {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    
	  
	 
	    String yesNo = "";
	   
	    String list="";
	    
	    
		do {
			
		System.out.println("Please enter guest name:");
		String name=input.next();
		System.out.println("Do you want to enter new guest name:");
		yesNo=input.next();  
		
		list=list+name+ ", ";
		   
	
	    } while(yesNo.equalsIgnoreCase("yes"));
		
	   	System.out.println("Guest's list: " + list.substring(0, list.length()-2) );

	}

	
}

/*Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)

Ask for the first guest name.

Then ask does user want to enter one more guests.

If yes - take the next guest input

If not - finish the program and print list of the guests.

Example:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda*/