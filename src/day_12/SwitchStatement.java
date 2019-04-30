:package day_12;
import java.util.*;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
int daynumber;
System.out.println("What number of the day today?");
daynumber = scan.nextInt();

	switch (daynumber) {
	case 1:
		System.out.println("Today is Monday");
		break;
	case 2:
		System.out.println("Today is Tuesday");
		break;
	case 3:
		System.out.println("Today is Wednesday");
		break;
	case 4:
		System.out.println("Today is Thursday");
		break;
	case 5:
		System.out.println("Today is Friday");
		break;
	case 6:
		System.out.println("Today is Saturday");
		break;
	case 7:
		System.out.println("Today is Sunday");
		break;
		default:
			System.out.println("Not valid day");
			break;
	}
	}

}
