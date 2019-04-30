package day35;

public class DecryptionFun {
	
	public static void main(String[] args) {
		
		System.out.println(decryptSentence("r olev qzez"));
		System.out.println(decryptSentence("szev z tllw wzb"));
	
		
		
	}
	
	public static char dencryptedChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		char ret =alphabet.charAt(encrypted.indexOf(ch));
		return ret;
	}
	
	
	public static String dencryptedWord(String word) {
		String converted="";
		for (int i = 0; i < word.length(); i++) {
			converted+=dencryptedChar(word.charAt(i));
		}
		return converted;
	}
	public static String decryptSentence(String sentence) {
		String [] wordsArr = sentence.toLowerCase().split(" ");
		String retValue="";
		for (String word:wordsArr) {
			retValue+=dencryptedWord(word)+" ";
			
			
		}
		return retValue.trim();
		
	}

}
