package MyOwnPracticies;

import java.util.Scanner;

public class Assigment104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO Type your code below:
	   
	    
	    
	    String [] words = nums.split(" ");
		for(int i =0; i<=words.length - 1; i++){
		
		   System.out.println(words[i]);
		}
	}

}
