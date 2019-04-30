package MyOwnPracticies;

import java.util.Arrays;
import java.util.Scanner;

public class Asigment126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan = new Scanner(System.in);
		int sizeInner = scan.nextInt();
		int sizeOuter = scan.nextInt();
		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];
		for(int i =0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
		}
		for(int j =0; j < sizeOuter; j++) {
			outer[j] = scan.nextInt();
		}
		Arrays.sort(inner);
		Arrays.sort(outer);
		//WRITE YOUR CODE HERE
		
		for(int i=0;i<inner.length;i++){
			for(int j=0;j<outer.length;j++) {
				if(outer[i]==inner[j]){
		    System.out.println("true");
		  } else{
		    System.out.println("false");
			}
		  
		  }
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
