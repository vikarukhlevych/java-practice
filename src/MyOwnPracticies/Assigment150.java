package MyOwnPracticies;

import java.util.Arrays;
import java.util.Scanner;

public class Assigment150 {

	
		public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    timeConversion(scan.nextLine());
		  }
		  
		  public static void timeConversion(String s) {
		    /*
				 * Write your code here.
				 */
				 
				
				if(s.equals("12:00:00PM")) {
					  s=s.replace("PM", "");
						 System.out.println(s); 
				   } else if(s.equals("12:00:00AM")) {
						 System.out.println("00:00:00"); 
				   }else if(s.contains("AM")){
						  s=s.replace("AM","");
						  System.out.println(s);
					   
				   } else {
					   // 9:45:45PM ---> 21
					   String[]splitTimes = s.split(":");
					   String hours = s.substring(0,s.indexOf(":"));
					   int numHours = Integer.parseInt(hours);
					   numHours = numHours + 12;
					   String result = numHours+s.substring(s.indexOf(":"), s.indexOf("PM"));
					   System.out.println(result);
					  
				 
				 
					   
					   
				   }
		  }
}
				 
		

	


