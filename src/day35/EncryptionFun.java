package day35;

public class EncryptionFun {

	
	public static void main(String[] args) {
		
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="hfhjdskla;hytyvnska[785940\"
		//String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		String word ="tesla";
		
		//"e"-->"v"
		//"a"-->"z"
		//"s"-->"h"
		//"t"-->"g"
		//"e"-->"v"
		//"r"-->"i"
		
		
		//get a char from word
		//find indexOf in alphabet
		//read the char from encrypted at that index
		//add to some string
		
		
		char first = word.charAt(0); // its "e"
		int position = alphabet.indexOf(first);
		System.out.println("position: "+position);
		
		char enChar = encrypted.charAt(position);
		System.out.println(first +" --> "+enChar);
		
		//with a loop
		String encryptedWord ="";
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			//find in alphabet
			int index =alphabet.indexOf(ch);
			encryptedWord+=encrypted.charAt(index);
		}
		System.out.println(word);
		System.out.println(encryptedWord);
	}
}
