package replit_Strings_Loops;

import java.util.Scanner;

public class CountWord_Java_Python {

    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
           String sentence = scan.nextLine();
        String str= sentence.replaceAll(" ", "").replaceAll(",", "");
        System.out.println(jp(str));
        
    }

    public static boolean jp(String str) {
        
        int java=0;
        int phyton=0;
        
        
        do {
            if(str.contains("java")) {
                java++;
              str = str.replaceFirst("java", "");
            }
            
             if(str.contains("phyton")) {
                phyton++;
            str=str.replaceFirst("phyton", "");
        
            }
        }while(str.contains("java")||str.contains("phyton"));
        
        System.out.println(java);
        System.out.println(phyton);
        
       return java==phyton;
        
    }
}