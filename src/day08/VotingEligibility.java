package day08;

import java.util.Scanner;

public class VotingEligibility {
public static void main(String[] args) {
	
	System.out.println("How old are you?");
	Scanner scan = new Scanner(System.in);
	
	
	
	int VotingEligibility = 18;
	int yourAge = scan.nextInt();
	int years = yourAge-VotingEligibility;
	int yearsleft = VotingEligibility-yourAge;
	
	if(yourAge >=VotingEligibility) {
		
		System.out.println("You are eligible to vote");
		System.out.println("You have been eligible for "+ years+ " years");
	}else {
		
		
		System.out.println("You are not eligible to vote.");
		System.out.println("You still have "+ yearsleft+ " years");
		
		
		
		
		
	}
	
	
}

}
