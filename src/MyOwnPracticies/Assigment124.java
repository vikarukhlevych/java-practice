package MyOwnPracticies;

import java.util.Arrays;
import java.util.Scanner;

public class Assigment124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for(int i =0; i < size; i++) {
			num[i] = scan.nextInt();
		}
		//WRITE YOUR CODE HERE

  int[] newArray= new int[2];
  
		if(num.length>=2) {
	   newArray =Arrays.copyOf(num, 2);
		}else{
	   newArray =Arrays.copyOf(num,num.length);
   }
	  System.out.println(Arrays.toString(newArray));
   
    

	}

}
