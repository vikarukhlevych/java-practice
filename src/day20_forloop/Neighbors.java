package day20_forloop;

import java.util.Scanner;

public class Neighbors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word");
		String word = scan.next();
		
		//abcdd
		//Beeeeep - q
		//Beeeeep - d
		
		for (int i =0;i<word.length()-1;i++) {
			if (word.charAt(i) == word.charAt(i+1)) {
				System.out.println("Beeep - "+ word.charAt(i));
			}
		
		}

	}

}

