
package MyOwnPracticies;
import java.util.*;

public class Assigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		   String splitCheck, serviceQuality, onlyOneBill;
		   int numberOfPeople = 0;
		   
		   double checkAmount, totalToPay, checkAmountPerPerson, totalTip, checkAmountWithTip = 0, totalPerPerson, tipPerPerson;
		   checkAmount = 0.0;
		   System.out.println("Split:");
		   splitCheck= scan.next();
		   if(splitCheck.equalsIgnoreCase("yes")) {
			   System.out.println("Number of people:");
			   numberOfPeople = scan.nextInt();
			   if (numberOfPeople==0) {
				   System.out.println("Sorry, invalid number!"); //ADDED  
			   } else if (numberOfPeople >10) {
				   System.out.println("Unfortunatelly, we are not spliting check on more than 10 porsions!");
			   }
			   numberOfPeople = numberOfPeople;
			   checkAmountPerPerson = checkAmount/numberOfPeople; 
		   } else {
			 System.out.println("Is there only one person paying,right?");  // ADDED
			 onlyOneBill = scan.next();
			 if(splitCheck.equalsIgnoreCase("yes")) {
				 checkAmount=checkAmount;
			 }
		   }
		   System.out.println("Check amount:");
		   checkAmount= scan.nextDouble();   
		   System.out.println("Service Quality: Excellent, Great, Good, Fair or Poor?");
		   serviceQuality = scan.next();
		   if (serviceQuality.equalsIgnoreCase("Excellent")) {
			   checkAmountWithTip = checkAmount*0.25 + checkAmount;
		   } else if (serviceQuality.equalsIgnoreCase("Great")) {
			   checkAmountWithTip =checkAmount*0.20 + checkAmount;
		   } else if (serviceQuality.equalsIgnoreCase("Good")) {
			   checkAmountWithTip =checkAmount*0.15 + checkAmount;
		   } else if (serviceQuality.equalsIgnoreCase("Fair")) {
			   checkAmountWithTip =checkAmount*0.10 + checkAmount;
		   } else if (serviceQuality.equalsIgnoreCase("Poor")) {
			   checkAmountWithTip =checkAmount*0.05 + checkAmount;
		   }
		   checkAmountWithTip = checkAmountWithTip;
	
		   
		 switch(numberOfPeople) {
		 case 1:
			 System.out.println("Number of people entered: &");
			 break;
		 case 2:
			 System.out.println("Number of people entered: &&");
			 break;
		 case 3:
			 System.out.println("Number of people entered: &&&");
			 break;
		 case 4:
			 System.out.println("Number of people entered: &&&&");
			 break;
		 case 5:
			 System.out.println("Number of people entered: &&&&&");
			 break;
		 case 6:
			 System.out.println("Number of people entered: &&&&&&");
			 break;
		 case 7:
			 System.out.println("Number of people entered: &&&&&&&");
			 break;
		 case 8:
			 System.out.println("Number of people entered: &&&&&&&&");
			 break;
		 case 9:
			 System.out.println("Number of people entered: &&&&&&&&&");
			 break;
		 case 10:
			 System.out.println("Number of people entered: &&&&&&&&&&");
			 break;
			 
		 }
		 
		  totalToPay = checkAmountWithTip;
		  totalTip = (checkAmountWithTip-checkAmount);
		  totalPerPerson = checkAmountWithTip/numberOfPeople;
		  tipPerPerson = (checkAmountWithTip-checkAmount)/numberOfPeople;
		  System.out.println("Total to pay: "+ totalToPay);
		  System.out.println("Total tip: "+ totalTip);
		  if (splitCheck.equalsIgnoreCase("yes")) {     //ADDED
			  System.out.println("Total per person: "+ totalPerPerson);
			  System.out.println("Tip per person: "+ tipPerPerson);
		  }	  
	}

}
