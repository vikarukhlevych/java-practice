package MyOwnPracticies;

import java.util.Arrays;
import java.util.Scanner;

public class Assigment122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[8];
		    for(int i=0; i<inhabitants.length; i++) {
		      inhabitants[i] = input.nextInt();
		    }
		    
		    //TODO. Write you code below this line. 
		    int population=0;
		    for(int i =0;i<inhabitants.length;i++){
		      population=inhabitants[i]/2;
		      inhabitants[i]=population;
		      System.out.println(Arrays.toString(inhabitants));
		    }

	}

}
