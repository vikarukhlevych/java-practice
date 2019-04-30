package day_12;
import java.util.Scanner; //import java.util.*;


public class CalculatorV01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	// get numbers
	
	System.out.println("Enter first number");
	double num1 = input.nextDouble();
	System.out.println("Enter second number");
	double num2 = input.nextDouble();
	

	// get operator
	
	System.out.println("Select Operator: +, -, *, /, %");
	
	String operator = input.next();
	double result = 0.0;
	
	// perform calculation and display result
	
	if (operator.equals("+")) {
		result = num1 + num2;
	} else if (operator.equals("-")) {
		result = num1-num2;	
	} else if (operator.equals("*")) {
		result = num1*num2;
	} else if (operator.equals("/")) {
		if (num2 == 0.0) {
			System.out.println("You cannot devide by 0");
		}
		result = num1/num2;
	} else if (operator.equals("%")) {
		result = num1%num2;
	} else {
		System.out.println("Invalid Operator Selected: "+ operator);
		return;
		//return Stop execution.After this line nothing else will be printed.
	}
	
	System.out.println("Result: "+result);
	
}
}
