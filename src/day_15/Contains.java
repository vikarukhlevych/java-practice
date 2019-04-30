package day_15;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));
		
		
		String list = "potatoes, tomatoes, eggs, milk, bread, meat";
		if (list.contains("apples")) {
			System.out.println("Apples are there");
		} else {
			System.out.println("Lets add apples now");
		}
		
		
		boolean hasCucumbers = list.toLowerCase().contains("cucumbers");
		System.out.println("Contains cucumbers: "+ hasCucumbers);
				
		
		email = "name@yahoo.com";
		if (email.contains("@yahoo")) {
		
		System.out.println("It is yahoo email");
		} else if (email.contains("gmail")) {
			System.out.println("It is gmail email");
		}
		
		String name = "Viktoriia";
		if (name.contains("a") || name.contains("e") ) {
			System.out.println("My name contains  a or e");
		} else {
			System.out.println("My name does not contain a or e");
		}
		
		
	}

}
