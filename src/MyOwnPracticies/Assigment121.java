package MyOwnPracticies;

import java.util.Arrays;
import java.util.Scanner;

public class Assigment121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		    
		    
		    String[] words = str.split(", ");
		    System.out.println(Arrays.toString(words));
		    
		    
		    
		    int length=100;
	
		    
		    for(int i = 0;i<words.length;i++) {
		    	if(length > words[i].length()) {
		    		length= words[i].length();
		    	}
		    	}
		    String allWords ="";
		    	for(int i=0;i<words.length;i++) {
		    		if(words[i].length()==length) {
		    			allWords+=words[i]+" ";
		    		}
		    	}
		    	System.out.println(allWords);
		    	allWords=allWords.trim();
		    	String [] result = allWords.split(" ");
		    	
		    	Arrays.sort(result);
		    	
		    	System.out.println(Arrays.toString(result));
		    	
		    	
		    	
		    	
		    	
		    	
	}

	}

