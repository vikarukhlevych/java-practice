package day20_forloop;

public class WeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ForLoop:1-7
		//1 Monday
		//2- Tuesday
		
		
		
		for (int days = 1;days<=7;days++) {
			switch(days) {
			case 1: 
				System.out.println( days +" -Monday");
				break;
			case 2:
				System.out.println(days+ " -Tuesday");
				break;
			case 3:
				System.out.println(days+ " -Wednesday");
				break;
			case 4:
				System.out.println(days+ " -Thursday");
				break;
			case 5:
				System.out.println(days+ " -Friday");
				break;
			case 6:
				System.out.println(days+ " -Saturday");
				break;
			case 7:
				System.out.println(days+ " -Sunday");
				break;
				default:
					System.out.println("Invalid day");
		}

	}

	}
}
