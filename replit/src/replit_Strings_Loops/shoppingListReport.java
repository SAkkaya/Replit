package replit_Strings_Loops;

import java.util.Scanner;

public class shoppingListReport {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String devam = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;
        
        do {
            
            System.out.println("Enter Item"+count +" and its price:");
            item = scan.next();
            price=scan.nextDouble();
            System.out.println("Add one more item?");
            devam = scan.next();
            totalPrice+=price;
            shoppingListReport+=", Item"+count+": "+item+" Price: "+price;
            count++;
        }
        while(devam.equalsIgnoreCase("yes"));
        
        System.out.println(shoppingListReport.substring(2));
        System.out.println("Total price: "+totalPrice);
	}

}
