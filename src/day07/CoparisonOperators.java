package day07;

public class CoparisonOperators {

	public static void main(String[] args) {
		
		// == 
		System.out.println(5 == 5); //true
		
		System.out.println(50==5);
		
		
		int searchCount = 5000;
		System.out.println(searchCount == 5000); //true
		
		
		int expectedCount = 5010;
		System.out.println(searchCount == expectedCount);
		
		
		int speedLimit = 55;
		int currentSpeed = 75;
		System.out.println(currentSpeed == speedLimit );
		
		 boolean atLimit = currentSpeed == speedLimit;
		 
		 System.out.println("At Speed limit: "+ atLimit);
		 boolean overLimit = currentSpeed > speedLimit;
		 System.out.println("Over Speed limit: "+overLimit);
		 
		 boolean underLimit = currentSpeed < speedLimit;
		 System.out.println("Under Limit: "+ underLimit);
		 
		 
		 double balance = 150.0;
		 boolean broke = balance <= 0.0;
		 System.out.println("Broke? "+ broke);
		 
		 double transaction = 155.5;
		 
		 			//150  -  155.5
		 broke = (balance - transaction) < 0;
		 System.out.println("Will make broke/negative? "+ broke);
		 
		 
		 System.out.println(balance);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
	}
}
