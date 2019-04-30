package day08;

public class CastingPrimitives {
	public static void main(String[] args) {
		
		
		//cast double value int
		
		
		int i =(int)3.4;
		
		
		System.out.println(i);
		
		double price = 230.50;
		int dollars = (int)price;
		System.out.println(dollars);
		
		
		//Whole numbers.Byte,short,int
		
		int count = 244;
		byte byteCount = (byte)count;
		
		
		System.out.println(byteCount);
		
		long longValue = 345645L;
		int intValue = (int)longValue;
		System.out.println(intValue);
		
		int large = 5678;
		short small = (short)large;
		System.out.println("Small: "+small);
		
		int result = (int)(500.4/2.0); //250.2-->250
		
		System.out.println("Result: "+ result);
		
		
		
		
		
		
		
	}

}
