package MyOwnPracticies;
import java.util.*;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	    Scanner scan = new Scanner (System.in);
	    System.out.println("Enter month number:");
	    int numberOfTheMonth= scan.nextInt();
	   String month = null;
	    switch (numberOfTheMonth) {
	    case 1:
	    	month = "January";
	    break;
	    case 2:
	    	month = "February";
	    break;
	    case 3:
	    	month = "March";
	    break;
	    case 4:
	    	month = "April";
	    break;
	    case 5:
	    	month = "May";
	    break;
	    case 6:
	    	month = "June";
	    break;
	    case 7:
	    	month = "Jully";
	    break;
	    case 8:
	    	month = "August";
	    break;
	    case 9:
	    	month = "September";
	    break;
	    case 10:
	    	month = "October";
	    break;
	    case 11:
	    	month = "November";
	    break;
	    case 12:
	    	month = "December";
	    break;
	    default:
	    }
System.out.println(month);
	}

}
