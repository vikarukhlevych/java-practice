import java.util.Scanner;

public class EnterPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
String password = "abc123";
String input;

do {
	System.out.println("Enter password");
	input = scan.next();
} while (!input.equals(password)); // if input is not same as password,keep asking to enter

System.out.println("Your password is successfull");

	}

}
