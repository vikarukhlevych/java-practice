package day_15;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word1 = "github";
		System.out.println(word1.indexOf("t"));
		
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("yava"));

		
		String url = "www.okta.com";
		 int index = url.indexOf(".");
		 System.out.println("Position of . : "+index);
		System.out.println(url.charAt(index +1));
		
		
		String title = "Java - Google Search";
		
		int position = title.indexOf("-");
		char positionAfter = title.charAt(position + 1);
		char positionBefore = title.charAt(position - 1);
		System.out.println(position);
		System.out.println("Position after - : "+positionAfter +"!"); // print space
		System.out.println("Position before - : "+positionBefore+"!"); // print space 
		
		
		String country = "United States of America";
		
		 int positionOfStates = country.indexOf("States");
		 System.out.println(positionOfStates);
		 
		 
		 String word2 = "java, c++, python, tomcat, eclipse";
		 // using contains
		  if (word2.contains("c++")){
			  System.out.println("c+ is there");
		  } else {
			  
		  
		  System.out.println("c+ is not there");
		  }
		  
		  // indexOf
		  
		  if (word2.indexOf("c++") > -1) {
			  System.out.println("c+ is there");
		  }
		 
		 
		  
		  
		  
		
	}

}
