package day08;

public class ExplicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(10/2.0); //result is double cause double is bigger
		
		
		System.out.println(10/2.0);
		
		 int result = (int)(10/2.0);
		System.out.println(result);
		
		int rent1 = 987;
		int rent2 = 1100;
		int rent3 = 894;
		int rent4 = 1234;
				
				
		double avarage = (rent1+rent2+rent3+rent4) / 4.0; //double avarage = (double)(rent1+rent2+rent3+rent4) / 4;
		System.out.println(avarage);
				
		double d = 40.2;
		int i = (byte)d;
		// in above statement both explicit and implicit casting happenning.
		// explicit: double>byte
		//implicit: byte>int
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
				
	}
	
	

}
