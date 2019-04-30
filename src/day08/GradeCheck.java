package day08;
import java.util.Scanner;


public class GradeCheck {

	public static void main(String[] args) {
		//A,B,C,D
		
		System.out.println("What is the grare?");
		Scanner scan = new Scanner(System.in);
		
		char grade = scan.next().charAt(0);
		 if (grade=='A') {
			 
			 System.out.println("Excelent Job! Keep it up!");
		 }else {
			 System.out.println("How many points did you miss for 'A'?");
			 
			int points = scan.nextInt();
			System.out.println("Your grade "+ grade + " is not good enough."
					+ "You could earn "+ points+ " more points if you studied harder.");
			 
		 }
		
		
		
	}
}
