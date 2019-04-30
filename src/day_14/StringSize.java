package day_14;

public class StringSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Good morning";
		// check if i matches "Good Morning" and print match 
		//or Not match
		
		
		
		if (str1.equals("Good Morning")) {
			System.out.println("Match");
		} else {
			System.out.println("Not Match");
		}
		
		if (str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match - ignore case");
		} else {
			System.out.println("Not Match-ignore case");
		}
		
		
		//Convert to All Upper Case and print
		
		System.out.println(str1.toUpperCase());
		
		System.out.println(str1); // it stays as old value.not uppercase
		str1=str1.toUpperCase();
		System.out.println("After assigment - "+str1);
		
		//combine all above methods together:
		//convert to all lowercase first then check if it is equals "good morning"
		
		
		if (str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");
		} else {
			System.out.println("Chained methods: do not match");
		}

		// find our how many characters in the string
		 String myName = "Vika";
		 System.out.println(myName.length());
		
		int length = myName.length();
		System.out.println("My name's length: "+ length);
		 
		//usernames must be exactly 8 characters
		
		
		
		String userName = "Viktoriia";
		
		if (userName.length() == 8) {
			System.out.println("Good user name");
		} else {
			System.out.println("Invalid name");
		}
		
		String password = "vrukglsueye";
		if (password.length()>= 6) {
			System.out.println("Right");
		} else {
			System.out.println("Not enought characters");
		}
		
		//2version int passwordLenght = password.lenght();
		// if (passwordLenght< 6){
		//system.out.println("Invalid passw")
		//} else {
		// system.out.println("valid passw")
		//}
		
		
		
		
		
	}

}
