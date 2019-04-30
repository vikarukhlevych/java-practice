package day33;

public class AgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(calculateAge(1945));

	}

	
	public static int calculateAge(int year) {
		int thisYear =2019;
		int age = thisYear-year;
		
		if(age<=0) {
			System.out.println("Invalid age");
			return 0;
			
		} else if(age<=14) {
			System.out.println("children");
			
		} else if(age>=15 && age <=25) {
			System.out.println("youngster");
		
		} else if(age>=26 && age<=64) {
			System.out.println("Adult");
			
		} else if(age>=65) {
			System.out.println("senior");
			
		}
		return age;
		
	}
}
