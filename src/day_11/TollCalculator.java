package day_11;
import java.util.Scanner;

public class TollCalculator {
public static void main(String[] args) {
	
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter Vehicle Type: 1 or 2"); //1 and 2
	int carType = keyboard.nextInt();
	System.out.println("Is it rush hour: yes | no");
	String rushHour = keyboard.next(); // yes or no
	// check if rushHor string is "yes" => assign true to isRushHour
	//if its "no" assign false to isRushHour
	boolean isRushHour;
	if (rushHour.equalsIgnoreCase("yes")) {
		isRushHour= true;
	}else {
		isRushHour = false;
	}
	//System.out.println("isRushHour");
	double price =0.0;
	int miles = 100;
	
	if (carType == 1) {
		if (isRushHour) {
			
			price = 30.0; //A
		} else {
			price = 5.0; //B
		}			
		
		if(miles > 50.0) {
			price+=10.0;
		}
		
	}else if (carType == 2) {
		if(isRushHour) {
			price = 55.30; //C
		} else {
			price = 15.99; //D
			
		}
	}
	System.out.println(price);
	
	
}
}
