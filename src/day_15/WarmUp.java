package day_15;

//import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Enter emoji:");
		//Scanner scan = new Scanner(System.in);
		String emoji = ">:";
		
		if (emoji.length()!= 2) {
			System.out.println("Invalid emoji");
			return; // stop execution
		} 
		
		 // if code reaches this point, then emoji is 2 chars
		//  get first and second chars and assign to variables
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		
		
		if (first == ':' ) {   // if(first ==':')
								// if (second ==')')
			 if (second== ')' ) {
				System.out.println("smile"); // System.out.println("smile")
			} else if  (second == '(') { //else if (first ==':')
				//second == '(') 
					System.out.println("sad");
				} else if (second == '/') {
					System.out.println("upset");
				} else if (second == 'p') {
						System.out.println("playful");
				} else {
					System.out.println("Unknown emoji");
				}
		
		} else {
		System.out.println("Invalid");
		}
	}
}