package day33;

public class CalcTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(WarmUp.add(3, 1));
		System.out.println(WarmUp.multiply(5, 6));
		System.out.println(WarmUp.minus(40, 12));
		System.out.println(WarmUp.divide(100, 2));
		
		
		int addResult=WarmUp.add(21, 41);
		double mResult = WarmUp.multiply(50, 40);
		double miResult = WarmUp.minus(3000, 200);
		double dResult = WarmUp.divide(455, 5);
		
		System.out.println("addResult: "+addResult);
		System.out.println("mResult: "+mResult);
		System.out.println("miResult: "+miResult);
		System.out.println("dResult: "+dResult);
		
		
		
		double a=10.0, b=5.0;
		double myResult =WarmUp.minus(a, b);
		System.out.println("myResult: "+myResult);
		
		
		double[] dNums = {2.0,4.0};
		double result2 =WarmUp.multiply(dNums[0], dNums[1]);
		System.out.println("Result2: "+result2);
		
		
		if(WarmUp.add(10, 16)==26) {
			System.out.println(" ADD Unit tets passed");
		}else {
			System.out.println("Add Unit test failed");
		}
		
		String str ="java";
		if(str.length() ==4) {
			System.out.println("It is 4 characters");
		} else {
			System.out.println("It is not 4 characters");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
