package day_14;

public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Computer";
		//print all characters one by one
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		
		
		
		//string word2 and check if first character is "J"
		
		
		String word2 = "Java";
		if (word2.charAt(0)=='J') {
			System.out.println("J is first char");
		} else {
			System.out.println("'J'its not the first char");
		}
		
		String word3 = "VikaaV";
		 
		if(word3.charAt(0)==word3.charAt(5)) {
			System.out.println("First and last match");
		} else {
			System.out.println("First and last are different");
		}
		
		// String word4==> always print last character no matter the length
		String word4 = "adksjfsdfsdn";
		
		char lastChar = word4.charAt(word4.length()-1);
		System.out.println("Last value of "+ word4+ " is "+lastChar);
		
		
		
	

	}

}
