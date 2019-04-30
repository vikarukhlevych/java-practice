package day_15;

public class StartsEndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word1 = "eclipse";
		// stratsWith ==> tests if string starts with another string
		
		
		//true
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ecli"));
		
		// false 
		System.out.println(word1.startsWith("E"));
		System.out.println(word1.startsWith("eci"));
		 
		
		//endsWith
		
		System.out.println(word1.endsWith("e")); // true
		System.out.println(word1.endsWith("E")); // false
		System.out.println(word1.endsWith("eclipse")); // true
		
		
		
		//PSE
		
		System.out.println(word1.toUpperCase().endsWith("PSE")); // true
		
		String name = "Mr.Jackson";
		
		 if (name.startsWith("Mr.")){
			 System.out.println("Man");
		 } else if (name.startsWith("Mrs.")) {
			 System.out.println("Mariried woman");
		 } else if (name.startsWith("Ms.")) {
			 System.out.println("Some woman");
		 } else if (name.startsWith("Dr.")) {
			 System.out.println("Doctor");
		 } else {
			 System.out.println("Unknown status");
		 }
		
		
		
		
		
	}

}
