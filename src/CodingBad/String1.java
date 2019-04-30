package CodingBad;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		  Scanner scan = new Scanner(System.in);
		    double billAmount = 100.0;
		    System.out.println("Enter number of kW⋅h:");
		    int numberOfKwh = scan.nextInt();
		    if (numberOfKwh<=200){
		      System.out.println("Your bill this month is: $"+billAmount);
		    } else if (numberOfKwh>200 && numberOfKwh<=275){
		    billAmount +=(numberOfKwh-200)*0.40;
		    System.out.println("Your bill this month is: $"+billAmount);
		  } else if (numberOfKwh>275 && numberOfKwh<=325){
		     billAmount+=(numberOfKwh-200)*0.35;
		     System.out.println("Your bill this month is: $"+billAmount);
		  } else if (numberOfKwh>325 && numberOfKwh<400){
		    billAmount+=(numberOfKwh-200)*0.25;
		     System.out.println("Your bill this month is: $"+billAmount);
		  }
		
		}

	}


