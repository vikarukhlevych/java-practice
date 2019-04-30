package day_18;

import java.util.Scanner;

public class EnterPincode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int secretPincode = 1234;
		
		int pincode =0;
		
		while (pincode!=secretPincode) {
			System.out.println("Enter Pincode");	
			pincode = scan.nextInt();
		}
		
		System.out.println("Pincode is correct");
		
		
	}

}
