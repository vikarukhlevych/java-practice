package day_21;

import java.util.Scanner;

public class GetUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan = new Scanner(System.in);
		
		String word=scan.next(); //javva
		String unique="";
		
		
		//for(int i =0;i<word.length();i++) {
			//System.out.println(i);
			//System.out.println(word.charAt(i));
		//}
		
		for (int i =0;i<word.length();i++) {
			
			//read the letter and assign
			char letter = word.charAt(i);
			if (!unique.contains(""+letter)) {
				unique+=letter;
				
			}
		}
		System.out.println(unique);
	}

}
