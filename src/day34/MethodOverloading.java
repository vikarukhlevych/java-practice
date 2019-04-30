package day34;

public class MethodOverloading {
	public static void main(String[] args) {
		
		add(3,5);
		add(3.7, 8.9);
		add("vika","pika");
	}
	
	public static void add(int num1,int num2) {
		int result = num1+num2;
		System.out.println("Result: "+result);
	}

	
	public static void add(double d1,double d2) {
		double result = d1+d1;
		System.out.println("Result: "+result);
		
		
	}
	
	
	public static void add(String str1,String str2) {
		String result = str1+str2;
		System.out.println("Result: "+result);
		
		
	}
	
	
}
