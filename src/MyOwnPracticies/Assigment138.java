package MyOwnPracticies;

import java.util.Arrays;
import java.util.Scanner;

public class Assigment138 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if there is a zero in the element/city then adjacent city will 2
		//array and for loop
		
		//save first and calculate later
		
		
		Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    
	    //TODO. Write you code below this line. 
	    
	    boolean [] check = new boolean[inhabitants.length+2];
	    //storing info about where to divide by 2 in a boolean array
	    int sum=0;
	    int dayCount =0;
	    System.out.println("Day "+(dayCount++)+" "+Arrays.toString(inhabitants) );
	    do {
	    	sum =0;
	    for(int i = 0;i<inhabitants.length;i++) {
	    	if(inhabitants[i]==0) {
	    		check[i]=true;
	    		check[i+2]=true;
	    	}
	    	
	    }
	    
	    //accessing the boolean Array to make appropriate changes
	    
	    for(int j=1;j<check.length-2;j++) {
	    	if(check[j]) {
	    		inhabitants[j-1]/=2; //dividing the population by 2
	    		
	    	}
	    
	    	sum+=inhabitants[j-1];
	    }
	    
	    System.out.println("Day "+(dayCount++)+" "+Arrays.toString(inhabitants) );
	}while(sum!=0);

	    
	    
	    
	    System.out.println("---- EXTINCT ----");
	    

	    
	    
}
}
