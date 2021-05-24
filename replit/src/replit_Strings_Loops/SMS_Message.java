package replit_Strings_Loops;

import java.util.Scanner;

public class SMS_Message {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//String message = scan.nextLine();
	    String sender;
	    String phoneNumber;
	    String messageBody;
	    
	    String message="Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
	    
	    
	

            
            int i= message.indexOf("<");
            int j=message.indexOf(">");
            
            sender=message.substring(i,j);
            
            int k= message.indexOf("[");
            int l=message.indexOf("]");
            phoneNumber=message.substring(k,l);
            
            int m= message.indexOf("{");
            int n=message.indexOf("}");
            messageBody=message.substring(m,n);
            
            
            System.out.println("Sender: "+sender);
            System.out.println("Phone Number: "+phoneNumber);
            System.out.println("Message body: "+messageBody);
            
          }
        }
	   
	    
//	    System.out.println("Sender : " + message.substring(message.indexOf('<')+1,message.indexOf('>')));
//	    System.out.println("Phone Number : "+ message.substring(message.indexOf('[')+1,message.indexOf(']')));
//	    System.out.println("Message body : " + message.substring(message.indexOf('{')+1,message.indexOf('}')));
//	    
//	  }
//	}


/*Given a String message in the following format: Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving} assign the value of the sender, phoneNumber, and messageBody variables and print them.

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving*/

