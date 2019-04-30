package day_21;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many items you purchase?");
		int itemsCount = scan.nextInt();
		String itemName="";
		String item="";
		double price;
		double totalPrice=0;
for (int i =1;i<=itemsCount;i++) {
	System.out.println("Whats the item name: " +i);
	itemName = scan.next();
	item+=itemName+", ";
	System.out.println("Whats the item price?");
	price = scan.nextDouble();
	totalPrice+=price;
}
		item = item.substring(0,item.length()-1);
System.out.println("Your items: "+item);
		System.out.println("Total price: $"+totalPrice);
		
		
	}

}
