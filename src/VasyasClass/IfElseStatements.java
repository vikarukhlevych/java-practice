package VasyasClass;

import java.util.Scanner;

public class IfElseStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type the age");
		int age=scan.nextInt();
		if(age<21) {
			System.out.println("Under age");
		} else {
			System.out.println("Not under age");
		}
		
		
		
		

	}

}
