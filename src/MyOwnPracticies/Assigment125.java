package MyOwnPracticies;

import java.util.Arrays;
import java.util.Scanner;

public class Assigment125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
			for(int i =0; i < size; i++) {
				nums[i] = scan.nextInt();
			}
			//WRITE YOUR CODE HERE
			int [] newArray= new int[nums.length*2];
			newArray[newArray.length-1]=nums.length-1;
			System.out.println(Arrays.toString(newArray));

	}

}
