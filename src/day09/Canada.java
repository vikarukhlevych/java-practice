package day09;

import java.util.Scanner;

public class Canada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the capital of Canada?");
		String capital = scan.next();
		
		
		if (capital.equalsIgnoreCase("Ottawa")) {
			System.out.println("You are right!");
		}else {
			System.out.println("Your answer is incorrect!" + capital + " is not capital of Canada!!!!You are savoe slaboe zveno.Proschaiteeeeeee");
		}
		
		
		
		
		
		

	}

}
