package MyOwnPracticies;
import java.util.Scanner;

public class WarmUpp {
	public static void main(String[] args) {
	    //Write your code here
		Scanner scan = new Scanner(System.in);
		String in = scan.next();
		double price= 0.0;
	   if (in.equals("burger") || in.equals("chicken")) {
		   price =10.0;
	   } else if (in.equals("soda")) {
		   price = 2.0;
	   }
	} 
}

