package MyOwnPracticies;

import java.util.Scanner;

public class Assigment78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double premium = 0;
		String accidents = "";
		int yearsOfDriving = 0;
		int zipcode = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		String driverlicense;
		int age = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		// WRITE YOUR CODE HERE
		System.out.println("Enter your name");
		name = scan.nextLine();
		System.out.println("Do you have a US driver license?");
		driverlicense = scan.next();
		if (driverlicense.equalsIgnoreCase("No")) {
			System.out.println("Invalid data!");
			System.exit(0);
		} else if (driverlicense.equalsIgnoreCase("Yes")) {
			System.out.println("Enter your zip code");
			zipcode = scan.nextInt();
			if (zipcode == 20910 || zipcode == 20740) {
				premium += 60;
			} else if (zipcode == 22102 || zipcode == 22103) {
				premium += 30;
			} else {
				premium += 50;
			}
			System.out.println("Is this vehicle Owned, Financed, or Leased?");
			vehicleOwnership = scan.next();
			if (vehicleOwnership.equals("Owned")) {
				premium += 10;
			} else {
				premium += 20;
			}
			System.out.println("How is this vehicle primarily used?");
			vehicleUsage = scan.next();
			if (vehicleUsage.equals("Business")) {
				premium += 50;
			} else if (vehicleUsage.equals("Pleasure")) {
				premium += 10;
			} else if (vehicleUsage.equals("Commute")) {
				premium += 20;
				System.out.println("Days Driven To Work And/Or School");
				daysDrivenToWorkOrSchool = scan.nextInt();
				premium = premium + daysDrivenToWorkOrSchool * 5;
				System.out.println("Miles Driven To Work And/Or School");
				milesToWorkOrSchool = scan.nextInt();
				premium = premium + milesToWorkOrSchool * 1;
			}
			System.out.println("How old are you?");
			age = scan.nextInt();
			if (age < 16) {
				System.out.println("Invalid data!");
				System.exit(0);
			} else if (age >= 16 && age < 18) {
				premium = premium * 20;
			} else if (age >= 18 && age < 21) {
				premium = premium * 6;
			} else if (age >= 21 && age < 25) {
				premium = premium * 2;
			}
			System.out.println("How many years you've been driving?");
			yearsOfDriving = scan.nextInt();
			if (yearsOfDriving <= 0 && age - yearsOfDriving < 16) {
				System.out.println("Invalid data!");
				return;
			} else {
				premium = premium - (yearsOfDriving * 5);
			}
			System.out.println("Have you had any accidents in the last 5 years?");
			accidents = scan.next();
			if (accidents.equals("Yes") || accidents.equals("YES")) {
				System.out.println("How many?");
				accidentsAmount = scan.nextInt();
				premium = premium + (premium * 0.20 * accidentsAmount);
			} else {
				premium = premium;
			}
			System.out.println("Have you had continuous insurance for the past 12 months?");
			continuousInsurance = scan.next();
			if (continuousInsurance.equals("No")) {
				premium = premium * 2;
			} else {
				premium = premium;
			}
			System.out.println("What is the highest level of education you have completed?");
			education = scan.next();

			if (education.equals("PhD") || education.equals("Bachelors") || education.equals("Masters")) {
				premium = premium - (premium * 0.05);
			} else if (education.equals("Doctors")) {
				premium = premium - (premium * 0.1);
			} else {
				premium = premium + (premium * 0.05);
				education = "LESSTHANHIGHSCHOOL";
			}
			System.out.println(name + ", here's your quote!");
			System.out.println("Start Your Policy Today For: $" + premium);
			referenceNumber = name.substring(0, 2).toUpperCase()+ "" + age + name.substring(name.length() - 2).toUpperCase()
					+ "" + zipcode + "" + education.toUpperCase();
			System.out.println("Reference number: " + referenceNumber);
		}
	}

}
