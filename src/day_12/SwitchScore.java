package day_12;


public class SwitchScore {
public static void main(String[] args) {
	int score = 12;
	//1 ==>
	//2==>
	switch (score){
		case 1:
			System.out.println("Score is 1");
			break; // exit switch statement
		case 2:
			System.out.println("Score is 2");
			break; // exit from switch statement, it does not mean stop the code.
		case 3:
			System.out.println("Score is 3");
			break;
			default: // same as else statement with if
				System.out.println("Invalid Score");
				break; // works without this as well since default is the last at the switch statements.
	}
	
}
}
