package MyOwnPracticies;

import java.util.Arrays;
import java.util.Scanner;

public class Assigment153 {

	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    String[] words = new String[size];
	    for(int i=0; i < size; i++){
	      words[i] = scan.next();
	    }
	    printUniqueWords(words);
	  }
	  
	  public static void printUniqueWords(String[] words){
	    //WRITE YOUR CODE HERE
	    
	    Arrays.sort(words);
	    System.out.println(Arrays.toString(words));
	    String unique="";

	  
	    for(int i =0;i<words.length-1;i++){
	      if(!(words[i].equals(words[i+1]))){

	        //unique+=words[i];
	        System.out.println(words[i]);
	     


	  }
	}
	  }
}

