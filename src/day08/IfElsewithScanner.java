package day08;
import java.util.Scanner;

public class IfElsewithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//passingPercentage = 65;
		//yourScorePercentage = take from scanner
		//check if you passed or failed
		
		
		System.out.println("Your Percentage score");
		
	
		Scanner scan = new Scanner(System.in);
		
		int passingScore =65;
		int ScorePercentage = scan.nextInt();
		
		
		if (ScorePercentage>=passingScore) {
			System.out.println("You passed");
			
		}else {
			
			System.out.println("You failed");
		}
		

	}

}
