package day_21;

import java.util.Scanner;

public class task1 {
public static void main(String[] args) {
	
	
	Scanner scan=new Scanner(System.in);

	
	int num1=0;
	int num2=0;
	int sum=0;
	
	
	do {
		System.out.println("Enter 2 numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		sum = num1+num2;
	} while(sum<=100);
		System.out.println("Good number");
		System.out.println("Program ends");
}
}
