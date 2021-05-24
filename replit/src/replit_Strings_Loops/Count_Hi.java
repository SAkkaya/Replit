package replit_Strings_Loops;

import java.util.Scanner;

public class Count_Hi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	   
		String str = scan.nextLine();
		
		System.out.println(frequency(str, "hi"));
		
	}
	
		
		// returns the frequency of the word from a sentence
        public static int frequency(String sentence, String word) {
            sentence = sentence.toLowerCase();
            word =word.toLowerCase();
            int count = 0;
            while(sentence.contains(word)) {
                sentence = sentence.replaceFirst(word, "");
                count++;
            }
            
            return count;
        }
		
	}
	

		
//		Scanner scan = new Scanner(System.in);
//		   
//		String str = scan.nextLine();
//		
//		int count=0;
//		for (int i = 0; i < str.length(); i++) {
//			
//			if (str.contains("hi")) {
//				count++;
//				
//				str=str.replaceFirst("hi", "");
//			}
//			
//			
//		}
//		    
//		   System.out.println(count); 
//	}
//}


/*Print out the number of times that the string "hi" appears anywhere in the given string. Only lowercase "hi" should be counted.

Example:

input: abc hi how hi

output: 2


input: hi code java please

output: 1*/