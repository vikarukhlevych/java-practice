package day_18;

import java.util.Scanner;

public class GiveMe5Dollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String totalName="";
		String name ="";
	    String enterGuest;
	    System.out.println("Please enter guest name:");
	    name=input.nextLine();
	    System.out.println("Do you want to enter new guest name:");
	    enterGuest=input.next();
	    while(enterGuest.equalsIgnoreCase("yes")){
	      System.out.println("Please enter guest name:");
	      name = input.next();
	      System.out.println("Do you want to enter new guest name:");
		    enterGuest=input.next();
		    totalName = name.concat(name);
	    }
	    
	    System.out.println("Guest's list: "+totalName+", ");
	    }
	    
	

}
