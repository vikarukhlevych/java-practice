package day31;

import java.util.Scanner;

public class Calculator {
	
	
	//add, subtract, multiply, divide, remainder
	public static void main(String [] args ) {
		add(4,5);
		divide(7,10);
		divide(7,0);
		remainder(6,9);
		substract(2000,600);
		
		
		
		
		
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter 2 numbers");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		
		
		System.out.println("Select operator: +, -, *, /, %");
		String operator = scan.next();
		
		//using Scanner pass 2 numbers and operator
		
		switch(operator) {
		case "+": 
	add(n1,n2);
	break;
		case "-":
			substract(n1,n2);
				break;
				case "*":
				multiply(n1,n2);
				break;
				case "/":
				divide(n1,n2);
				break;
				case "%":
					remainder(n1,n2);
					break;
					default:
						System.out.println("Invalid operator");
			}
		
	}

	
	
	public static void add(double num1, double num2) {
		
		double result = num1+num2;
		System.out.println("Result: "+result);
	}
		public static void substract(double num1, double num2) {
		double result1 = num1-num2;
		System.out.println("Result: "+result1);
		}
		public static void multiply(double num1, double num2) {
		
		double result2 =num1*num2;
		System.out.println("Result: "+result2);
		}
		public static void divide(double num1, double num2) {
			if(num2==0) {
				System.out.println("Cannot divide by 0");
				return; //exit the method here
			}
		double result3 = num1/num2;
		System.out.println("Result: "+result3);
		}
		public static void remainder(double num1, double num2) {
			
		double result4 = num1%num2;
		System.out.println("Result: "+result4);
	}
	

}
