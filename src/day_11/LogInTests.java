package day_11;
import java.util.Scanner;

public class LogInTests {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	
	String validUsername = "cybertek@mail.com";
	String validPassword = "WoodenSpoon123";
	
	System.out.println("Enter valid Username:");
	 String username = scan.next();
	System.out.println("Enter valid Password:");
	String password = scan.next();
	if (username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
	System.out.println("Login Successful, Welcome");	
	} else if (!username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
		System.out.println("Invalid Username and Invalid Password");
	} else if (username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
		System.out.println("Valid username and Invalid Password");
	} else if (!username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
		System.out.println("Invalid Username and Valid Password");
	}
}
}


