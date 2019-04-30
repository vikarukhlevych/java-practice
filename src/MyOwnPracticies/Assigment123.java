package MyOwnPracticies;

import java.util.Arrays;
import java.util.Scanner;

public class Assigment123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
	    
	    int decimal = input.nextInt();
	    int[] binary = new int[8];
	    
	    //TODO: Write your code below.
	   
	    
	    int reminder =0;
	  for(int i=binary.length-1;i>=0;i--) {
	    	reminder =decimal%2;
	    	decimal = decimal/2;
	    	binary[i]=reminder;
	    }

	  System.out.println(Arrays.toString(binary));
	  
	  
	  
	  
	  
	}

}
