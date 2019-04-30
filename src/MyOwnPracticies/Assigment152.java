package MyOwnPracticies;

import java.util.Arrays;
import java.util.Scanner;

public class Assigment152 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	    for(int i=0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    printUniqueNumbers(nums);
	  }
	  
	  public static void printUniqueNumbers(int[] nums){
	    //WRITE YOUR CODE HERE
	    Arrays.sort(nums);
	    int unique=0;
	    
	    
	    //2, 5, 5, 6, 3, 6, 9, 34, 3    //2 3 3 5 5 6 6 9 34
	    for(int i =0;i<nums.length;i++) {
	    	if(nums[i]!=nums[i+1]) {
	    		unique=nums[i];
	    		System.out.print(unique);
	    	}
	    }
	    
	    
	  }
	}