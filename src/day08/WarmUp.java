package day08;
import java.util.Scanner; //import java.util.*

public class WarmUp {
	  public static void main(String[] args){
	    
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("Enter your area code:"); 
	  int areaCode = scan.nextInt();
	  
	  System.out.println("Enter local number");
	   int localNumber= scan.nextInt();
	  
	  String phonenumber = "("+areaCode+")"+"-" + localNumber;
	  System.out.println("Calling number "+ phonenumber);
	  
	  
	  

}
}