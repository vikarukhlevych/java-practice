package day33;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		addVoid(3,5);
		int result;
		result = add(9,5);
		System.out.println("Result in method add is: "+result);
		//add(3,5);
		
		
		
		
	}
		
		
		
		public static void addVoid(int num1,int num2) {
			int sum = num1+num2;
			System.out.println("Sum of num1 and num2 is: "+sum);
		}
		
		
		public static int add(int num1,int num2) {
			int sum = num1+num2;
			return sum;
		}
		
		
		public static double multiply(double num1,double num2) {
			double multiply = num1*num2;
			return multiply;
		}
		
		public static double minus(double num1,double num2) {
	double minus = num1-num2;
	return minus;
}
		
		public static double divide(double num1,double num2){
			if(num2==0) {
				System.out.println("ERROR: Cannot / by 0");
				return 0;
				
			} else {
		double divide = num1/num2;
		return divide;
			}
		}
		
}
