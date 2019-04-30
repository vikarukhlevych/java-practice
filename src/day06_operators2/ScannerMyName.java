package day06_operators2;


import java.util.Scanner;




public class ScannerMyName {
public static void main(String[] args) {
	
	//create Scanner object
	
	
	
	String day1 = "I will go to the hospital";
	System.out.println(day1);
	
	
	
	Scanner input = new Scanner(System.in);
	System.out.println("When are you going to see doctor?");
	 String day = input.next();
	 System.out.println("Yes, I remember,you have an appointment on " + day);
	 
	
	 Scanner scan = new Scanner(System.in);
	 
	 
	 System.out.println("Enter 3 numbers: ");
	 int num1 = scan.nextInt();
	 int num2 = scan.nextInt();
	 int num3 = scan.nextInt();
	 int sum = num1 + num2 + num3;
	  
	 System.out.println( "Sum of numbers: " + sum);
	 
	
	  
}
}

