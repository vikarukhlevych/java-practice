package day23;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write the peogram that will take from user 6 words concat words with a comma
// if word is eqials to java
		//skip this word
		//print summary at the end of the program
		
		Scanner scan = new Scanner(System.in);
		
		String word="";
		String allWords="";
		
		for (int i = 0;i<6;i++) {
			System.out.println("Type the word");
			word = scan.next();
			if(word.contentEquals("java")) {
				continue;
				
			}
			allWords+=word+", ";
		}
		allWords=allWords.substring(0,allWords.lastIndexOf(","));
System.out.println("All words: "+allWords);
	}

}
