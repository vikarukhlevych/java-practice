package day31;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		countUp(3);
		countDown(0);
Scanner scan = new Scanner(System.in);
System.out.println("Enter num to countUp");

//get number from keyboard  		
 int inputNum = scan.nextInt();
 //call countUp method and set it as input
 countUp(inputNum); 
 

	}

	
	public static void countUp(int n) {
		
		for(int i =1;i<=n;i++) {
			System.out.print(i+",");
			
			}
		if(n<1) {
			System.out.println("Invalid input");
		}
		System.out.println();
	}
	
	public static void countDown(int k) {
		for(int i=k;i>=1;i--) {
			System.out.print(i+", ");
		}
		
		if(k==0) {
			System.out.println("Invalid input");
		}
	}
	
}
