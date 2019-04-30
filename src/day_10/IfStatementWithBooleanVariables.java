package day_10;

public class IfStatementWithBooleanVariables {
	public static void main(String[] args) {
		
		
		boolean isBreakTime =true;
		
		if(isBreakTime == true) {
			System.out.println("Break untill 8:35pm");
		} else {
			
			System.out.println("Not break time yet.");
		}
		
		
		
		
		
		//secong version
		
		if(isBreakTime == true) {
			System.out.println("Break untill 8:35pm");
			
		} else {
			
			System.out.println("Not break time yet.");
		}
		
		boolean classTime = true;
		if (classTime) {
			System.out.println("Come back on time");
			System.out.println("Stop talking");
			System.out.println("Pay attention");
			
		}else {
			
			System.out.println("Take a walk and have some coofee");
		}
		
		
		
		boolean qualified = false;
		//send a notification massage if not qualified
		
		if(qualified == false) {
		System.out.println("You aplication was not approved");
		}
		
		
		
	}

}
