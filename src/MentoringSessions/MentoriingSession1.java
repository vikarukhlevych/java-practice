package MentoringSessions;
import java.util.Scanner;


public class MentoriingSession1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//requirements:
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What color of the traffic light?");
		String color= scan.next(); // String color = scan.next().toLowerCase();
		
		switch(color) {
		case "red":
		System.out.println("Dont Drive");
		break;
		case "yellow":
			System.out.println("Pay attention if you can drive");
			break;
		case "green":
			System.out.println("Go ahead and drive");
			break;
			default:
				System.out.println("Invalid color!!!!!!!");
		} 

	}

}
