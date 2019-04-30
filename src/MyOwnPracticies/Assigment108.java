package MyOwnPracticies;

import java.util.Scanner;

public class Assigment108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    
	    int count=0;
	    //Write your code below
	    
	    for(int i=0;i<=email.length()-1;i++){
	      if(email.substring(i,i+1).contains("@")) {
	        count++;
	      }
	        if(count==1){
	          String[] split = email.split("@");
	          System.out.println("Email id: "+split[0]);
	    	  System.out.println("Email domain: "+split[1]);
	        } else {
	    	System.out.println("invalid email");
	        }
	    }
}
}