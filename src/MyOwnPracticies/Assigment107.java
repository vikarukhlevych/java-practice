package MyOwnPracticies;

import java.util.Scanner;

public class Assigment107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO: Write your code below
	    int count=0;
	    for (int i=0;i<nums.length;i++){
	      if(i%2==0) {
	    	  count++;
	      }
	      }
	     System.out.println(count);
	    
	    }

	}

