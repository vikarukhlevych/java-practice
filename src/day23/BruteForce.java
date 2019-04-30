package day23;

import java.util.Scanner;

public class BruteForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);

		
		String ecpectedUserName="admin";
		String expectedPassword = "admin123";
		int attempts = 5;
		
		String userName = "";
		String password = "";
		
		
		do {
			if(attempts==0) {
			System.out.println("You have exceeded number of attempts");
			System.out.println("This user has beem deactivated for 3 min");
			return;
			}
			attempts --;
			System.out.println("Please enter user name");
			userName= scan.next();
			if (!userName.contentEquals("expextedUserName")) {
				System.out.println("Wrong user name");
				System.out.println("Attempts left: "+attempts);
				continue;
			}
			System.out.println("Please enter password");
			password = scan.next();
			System.out.println("Wrong password");
			System.out.println("Attempts left: "+attempts);
			
		} while(!userName.equals("expectedUserName")|| !password.equals(expectedPassword));
		
		System.out.println("Login successful");
		
		
	}

}
