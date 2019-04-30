package day23;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int count=0;
		int num =scan.nextInt();
		for (int i = 2;i<=num;i++) {
			
			if (num%i==0) {
				System.out.println("its not a prime number");
				break;	
			}
			System.out.println("this is not a price number");
				
			
			
			
		}
		
		
	}

}
