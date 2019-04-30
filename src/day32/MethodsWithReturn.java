package day32;

public class MethodsWithReturn {
	
	public static void main(String[] args) {
		System.out.println(giveMe10$() );
		int i = giveMe10$();
		System.out.println("i: "+i);
		
		String myName = giveMeYourName();
		System.out.println(myName);
		
	}
	
	
	/*/
	 * this method returns int value
	 * 
	 */
	
	
	
	public static int giveMe10$() {
		System.out.println("returning 10 from method");
		return 10;
	}
	
	
	/*/
	 * gomeMeyourName();
	 * return type: String
	 * 
	 */
	
	
	
	public static String giveMeYourName() {
		
		String name = "Viktoriia Rukhlevych";
		return name;
		
		
	}

}
