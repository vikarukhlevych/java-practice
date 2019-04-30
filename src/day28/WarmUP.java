package day28;

import java.util.Arrays;

public class WarmUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String sentence= "vika vlad lena vanya";
		String [] reversed = sentence.split(" ");
		
		
		
		System.out.println("Number of words: "+reversed.length);

		
		
		System.out.println(Arrays.toString(reversed));
		
		String reversed1="";
		
		for(int i=reversed.length-1;i>=0;i--) {
			System.out.println(reversed[i]);
			reversed1+=reversed[i]+" ";
			
			
		}
		reversed1=reversed1.trim();
		
		System.out.println(reversed1);

	}

}
