package MyOwnPracticies;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.
		
	
		//Declare 2 int variables: age, zipcode
		//Declare 2 double variables: height, weight.
		//Declare boolean variable: isMarried (for marriage status).
		//Declare 2 long variables: workPhoneNumber and personalPhoneNumber.
		
		
		Scanner scan = new Scanner(System.in);
		String firstName, lastName, fullName, email, street, state, city, address, contacts;
		int age, zipcode;
		double height, weight;
		boolean isMarried;
		long workPhoneNumber, personalPhoneNumber;
		//-Display prompt "Welcome to the patient portal!"
		//-Display prompt "Please enter your personal information"
		System.out.println("Welcome to the patient portal!\nPlease enter your personal information");
		
		//Display prompt "Enter your first name James
		//-Display prompt "Enter your last name"May
		//-Display prompt "Enter your email" jamesmay@gmail.com
		
		System.out.println("Enter your first name");
		String firstName1 = scan.nextLine();
		System.out.println("Enter your last name");
		String lastName1 = scan.nextLine();
		System.out.println("Enter your email");
		String email1 = scan.nextLine();
		System.out.println("Enter your street");
		String street1 = scan.nextLine();
		System.out.println("Enter your city");
		String city1 = scan.nextLine();
		System.out.println("Enter your state");
		String state1 = scan.nextLine();
		System.out.println("Enter you zip code");
		int zipcode1 = scan.nextInt();
		System.out.println("Enter your work phone number");
		long workPhoneNumber1 = scan.nextLong();
		System.out.println("Enter your personal phone number");
		long personalPhoneNumber1 = scan.nextLong();
		System.out.println("Enter your age");
		int age1 = scan.nextInt();
		System.out.println("Enter your height");
		double height1 = scan.nextDouble();
		System.out.println("Enter your weight");
		double weight1 = scan.nextDouble();
		System.out.println("Are you married");
		boolean isMarried1 = scan.nextBoolean();
		
		System.out.println("Patient personal information");
		System.out.println("Full name: "+ firstName1+","+lastName1);
		System.out.println("Adress: "+street1+","+city1+","+ state1+ zipcode1);
		System.out.println("Contacts: work phone number - "+workPhoneNumber1+", personal phone number - "+ personalPhoneNumber1+", email: "+email1);
		System.out.println("Age: "+ age1);
		System.out.println("Height: "+height1);
		System.out.println("Weight: "+weight1 +" pounds");
		System.out.println("Married?: "+ isMarried1);
		
		
		
		
		
		
		
	}

}
