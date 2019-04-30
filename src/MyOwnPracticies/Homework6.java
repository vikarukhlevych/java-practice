package MyOwnPracticies;
import java.util.Scanner;

public class Homework6 {
public static void main(String[] args) {
	int num,digit1, digit2, digit3, digit4, digit5;
	Scanner object = new Scanner(System.in);
    System.out.println("Enter your number:");
    num = object.nextInt();
    digit1 = num/10000;
    digit2 = (num-digit1*10000)/1000;
    	digit3 = (num-(digit1*10000+digit2*1000))/100;
    		digit4 = (num-(digit1*10000+digit2*1000+digit3*100))/10;
    		digit5 = (num-(digit1*10000+digit2*1000+digit3*100+digit4*10));
    		System.out.println(digit1);
    		System.out.println(digit2);
    		System.out.println(digit3);
    		System.out.println(digit4);
    		System.out.println(digit5);
}
}
