package day_16;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your url");
		
		
		String url = scan.next();
		
		if (url.startsWith("www.")){
			System.out.println("It starts with www.");
		} else {
			System.out.println("Invalid url format");
			return;
		}	
		
		
		 //check  . is there right before extension
		
		
		int dotIndex = url.length()-4;
		//url.lastIndexOf(".");
		
		 if (url.charAt(dotIndex)== '.') {
			 System.out.println(". is there before extension");
		 } else {
			 System.out.println(". might be misplaced");
		 }
			
		 // if (url.charAt(url.length()-4) == '.')
		
		 
	String domain = url.substring(4, dotIndex);
	String extension= url.substring(dotIndex+1, url.length());
	System.out.println("Domain is : " + domain);
	System.out.println("Extension is : "+ extension);
	
		
		
		
		
	}

}
