package MyOwnPracticies;
import java.util.Scanner;

public class Homework1 {
public static void main(String[] args) {
	
	
	String item1, item2, item3, report;
    double price1, price2, price3, totalPrice;
    int count1, count2, count3;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Item1, count and its price:");
    item1 = scan.next();
    count1 = scan.nextInt();
    price1 = scan.nextDouble();
    System.out.println("Enter Item2, count and its price:");
    item2= scan.next();
    count2 = scan.nextInt();
    price2= scan.nextDouble();
    System.out.println("Enter Item3, count and its price:");
    item3= scan.next();
    count3 = scan.nextInt();
    price3= scan.nextDouble();
    totalPrice =price1+price2+price3;
    
    if(count1>0) {
    	if (count2>0) {
    		if(count3>0) {
    			System.out.println(totalPrice);
    		}
    	}
    }
    	//"Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
   if(count1>0) {
	   
   }else { 
	   if (count2>0) {
	   
   }else { 
	   if(count3>0) {
	   
   }
	   }
	   
   }
   report = ("Item1: "+ item1+" Price: "+price1+", Item2: "+ item2+" Price2: "+price2+", Itrem3: "+item3+" tomatoesPrice3: "+price3);
	System.out.println(report);
  
    System.out.println("Total price: "+totalPrice);
    
    }
    
    
	
}

