package replit_Strings_Loops;

import java.util.Scanner;

public class Split_Email_Reverse2_With_Methods {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String email = scan.next();
        
        
        
        if(email.contains("_")) {
            
            
            String[] arr=email.split("_");
            String surname=arr[1].split("@")[0];
            String mail=arr[1].split(surname)[1];
            
            
            System.out.print(surname+"_"+arr[0]+mail);
            
        }
        
        else {System.out.println(email);}
      }
    }