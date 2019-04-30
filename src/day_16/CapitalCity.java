package day_16;

public class CapitalCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "Moscow is a capital of Russia";
		//Baku , Azerbaijan
		
		str = str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
		System.out.println(str);
		
		
		String email = "firstName_LastName@gmail.com";
		
		String company = "deloitte";
		String newEmail = email.replace("gmail", company);
		System.out.println(newEmail);

	}

}
