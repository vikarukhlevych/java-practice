package day23;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//write program that will calculate a sum of 6 numbers
		//if numbers is less or equals to 0 ignore this
		//we need to ask user provide a number 
		int num = 0;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		
		for (int i = 0;i<6;i++) {
			System.out.println("Enter a number");
			num = scan.nextInt();
			
			if(num<0) {
				continue;
			}
			sum+=num;
			
		}		
		
System.out.println("Total sum: "+sum);
	}

}
