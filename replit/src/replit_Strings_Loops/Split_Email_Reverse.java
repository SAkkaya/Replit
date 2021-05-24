package replit_Strings_Loops;

import java.util.Scanner;

public class Split_Email_Reverse {

	public static void main(String[] args) {
	      // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        
        
        
        if(email.contains("_")) {
            
            int i=email.indexOf("_");
            
            String name=email.substring(0,i);
            
            int j=email.indexOf("@");
            String surname=email.substring(i+1,j);
            
            System.out.println(surname.concat("_").concat(name).concat(email.substring(j)));
            
            
            
        }
        
        else {System.out.println(email);}
      }
    } 