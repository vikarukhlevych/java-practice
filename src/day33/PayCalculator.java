package day33;

public class PayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(gethourlyPay(0,5));
		
		System.out.println(gethourlyPay(45,55));
	}

	
	
	public static double gethourlyPay(int hours,int rate) {
		double totalPay = hours*rate;
		if(hours<=0) {
			System.out.println("Invalid hours");
			return 0;
		}
		if(rate<=0) {
			System.out.println("Invalid rate");
			return 0;
		//}else {
		}return totalPay;
		
		
	}
	
	
	
	
	
}
