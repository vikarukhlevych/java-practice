package MyOwnPracticies;

import java.util.Scanner;

public class Homework9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    String name = email.substring(0,1).toUpperCase()+email.substring(1,email.indexOf("_"));
	    String lastName = email.substring(email.indexOf("_")+1, email.indexOf("_")+2).toUpperCase() + email.substring(email.indexOf("_")+2, email.indexOf("@"));
	    String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
	    String TopLevelDomain = email.substring(email.indexOf(".")+1);
	    System.out.println("First name: "+ name);
	    System.out.println("Last name: "+ lastName);
	    System.out.println("Domain: "+domain);
	    System.out.println("Top-Level Domain: "+TopLevelDomain);
	    

	}

}
