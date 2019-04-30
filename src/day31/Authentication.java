package day31;

public class Authentication {
	
	
	
	
	
	/*/
	 * Nme: Login
	 * Return type: void
	 * 2 String args/params: username,password
	 * Inside the method:
	 * validUsernzme = "mentoring@cybertekschool.com"
	 * validPAssword = "mentor001"
	 *if userName and Password match print Login Successful!Welcome to Okta! 
	 *if not : "Sign in failed "
	 * 
	 */

	
	
	


		public static void Login(String userName,String password) {
	String validUsername = "mentoring@cybertekschool.com";
	String validPassword = "mentor001";
	if(userName.equals(validUsername) && password.equals(validPassword)) {
		System.out.println("Login Successful!Welcome to Okta!");
	} else {
		System.out.println("Sign in failed");
	}
}
		 public static void main (String [] args) {
			 Login("mentoring@cybertekschool.com","mentor001");
			 
			 
			 
		 }
		
		
}