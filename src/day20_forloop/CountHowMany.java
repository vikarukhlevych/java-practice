package day20_forloop;

public class CountHowMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//word
		//char to count the number of occurences
		String word = "Amazon";
		char myChar='a';
		int counter = 0;
		for (int i = 0; i<word.length();i++) {
			if (word.charAt(i)==myChar) {
				counter++;
			}
			
		}
		System.out.println("Count: " + counter );
	}

}
