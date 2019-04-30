package day31;

import java.util.Arrays;

public class MethodsWithStrings {
	public static void main(String[] args) {
		
		
		 countWords("Hello world");
		 
		 googleSearchResults("About 121,000,000 results (0.75 seconds)");
		 
	}
	
	public static void countWords(String sentence) {
		
		
		String [] words = sentence.split(" ");
		System.out.println(Arrays.toString(words));
		System.out.println("Number of words: "+words.length);
		
		//words in this sentence [Java, is, fun];
		//number of Words
		
		
	}
public static void googleSearchResults(String result) {
	
	String [] arr = result.split(" ");
	//System.out.println(Arrays.toString(arr));
	
	System.out.println("Results count: "+arr[1].replace(",", "") );
	System.out.println("Time in seconds: "+ arr[3].replace("(", ""));
}
	
	
}
