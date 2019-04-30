package day_12;

public class ORLogicWithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char grade = 'B';

switch(grade) {
// A,B,C -> Pass D, E -> Fail others-Invalid Grade
case 'A':
case 'B':
case 'C':
	System.out.println("Pass");
	break;
case 'D':
case'E':
	System.out.println("Fail");
break;
default:
	System.out.println("Invalid Grade");


}



	}

}
