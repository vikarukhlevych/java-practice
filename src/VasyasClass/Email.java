package VasyasClass;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String email = generateEmail("James","Bark");
		System.out.println(email);
		
		String email2 = generateEmail("Vika","Ru","mail");
		System.out.println(email2);
		
		String[] characters = {"Savannah Daniel", "Abby Green", "Velma Griffin", "Veronica Cooper", "Milly Fitzpatrick"};
	for(String str:characters) {
		String name = str.split(" ")[0];
		String lastName = str.split(" ")[1];
		System.out.println(generateEmail(name,lastName));
	}
	
	
	}

	//this method takes only 2 parametrs
	public static String generateEmail(String firstName,String lastName) {
		return firstName.toLowerCase()+"_"+lastName.toLowerCase()+"@gmail.com";
		
	}
	
	
	//this method take 3 parametrs
	public static String generateEmail(String firstName,String lastName,String domain) {
		return firstName.toLowerCase()+"_"+lastName.toLowerCase()+"@"+domain+".com";
		
	}
	
	
	
	
	
}
