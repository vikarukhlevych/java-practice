package day35;

public class EncryptionFunV2 {

	public static void main(String[] args) {
		System.out.println(encryptedChar('k'));
		String normal ="sunday";
		String encrypted =encryptedWord(normal);
		
		System.out.println(encryptedWord("cyphered"));
		System.out.println("normal: "+normal+"\n"+
											"encrypted: "+encrypted);
		
		
		System.out.println(encryptSentence("java is fun"));
		System.out.println(encryptSentence("i love java"));
	}
	
	/*/
	 * 
	 * encyptChar
	 * return type: char
	 * param: char
	 * takes a char and return encypted version
	 */
	
	/*/
	 * 
	 * encryptWord
	 * return type:string
	 * param:string
	 * takes a spting and returns encypter version for the whole word
	 */
	
	
	
	
	
	public static char encryptedChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		char ret =encrypted.charAt(alphabet.indexOf(ch));
		return ret;
	}
	
	
	public static String encryptedWord(String word) {
		String cyphered="";
		for (int i = 0; i < word.length(); i++) {
			cyphered+=encryptedChar(word.charAt(i));
		}
		return cyphered;
	}
	
	/*/
	 * encryptSentence
	 * return type: String
	 * param: String sentence
	 * Split sentence by space and call encryptedWord and
	 *return encrypted sentence
	 * 
	 */
	
	public static String encryptSentence(String sentence) {
		String [] wordsArr = sentence.toLowerCase().split(" ");
		String retValue="";
		for (String word:wordsArr) {
			retValue+=encryptedWord(word)+" ";
			
			
		}
		return retValue.trim();
		
	}
	
	
}
