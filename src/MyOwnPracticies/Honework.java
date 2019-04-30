package MyOwnPracticies;
import java.util.Scanner;

public class Honework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    //WRITE YOUR CODE HERE
		Scanner object = new Scanner(System.in);
	    int num1, num2, num3;
	    System.out.println("Enter first number:");
	    num1 = object.nextInt();
	    System.out.println("Enter second number:");
	    num2 = object.nextInt();
	    System.out.println("Enter third number:");
	    num3 = object.nextInt();
	    if(num1> num2 && num2<num3 && num3>num1) {
	    	System.out.println("Medium value is: "+ num1);
	    } else if(num2>num1 && num2<num3 && num3>num1) {
	    	System.out.println("Medium value is: "+ num2);
	    }else if (num3>num1 && num3<num2 && num2>num1){
	      System.out.println("Medium value is: "+ num3);
	    }
	    
	}

	
}
