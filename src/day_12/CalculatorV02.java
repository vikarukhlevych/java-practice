package day_12;
import java.util.*;

public class CalculatorV02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
String operator;
int num1,num2,result;
result = 0;
System.out.println("What is number1?");
num1= scan.nextInt();
System.out.println("What is number2?");
num2= scan.nextInt();
System.out.println("What operator?");
operator = scan.next();
switch(operator) {
case "+":
	result = num1+num2;
	break;
case "-":
	result = num1-num2;
	break;
case "*":
	result = num1*num2;
	break;
case "/":
	result = num1/num2;
	break;
case "%":
	result = num1%num2;
	break;
	default:
		System.out.println("Invalid Operator");
}
System.out.println("Result:"+ result);
	}

}
