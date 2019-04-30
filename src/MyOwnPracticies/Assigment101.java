package MyOwnPracticies;

import java.util.Scanner;

public class Assigment101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   

	    //TODO: Write your code below
	    
	    for(int i=0;i<words.length;i++){
	      System.out.print(words[0].substring(words.charAt(0),words.charAt(words.length-1)));
	    System.out.print(words[1].substring(words.charAt(0),words.charAt(words.length-1)));
	    System.out.print(words[2].substring(words.charAt(0),words.charAt(words.length-1)));
	    System.out.print(words[3].substring(words.charAt(0),words.charAt(words.length-1)));
	    System.out.print(words[4].substring(words.charAt(0),words.charAt(words.length-1)));
	      
	    }
	    

}
}