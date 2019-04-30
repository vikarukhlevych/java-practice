package day_18;

import java.util.Scanner;

public class PinCodeV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
int pincode = 0;
int attempts = 0;
		int secretPincode = 4321;
		//give only 3 attempts
		// if attemts reaches more 3 print card block
		
		while (pincode !=secretPincode) {
			System.out.println("Enter Pincode");
			pincode = scan.nextInt();
			attempts++;
			if (attempts == 4 && pincode !=secretPincode) {
				System.out.println("Card is blocked");
				return;
			}

		}
		System.out.println("Access granted,select operation");
	}

}
