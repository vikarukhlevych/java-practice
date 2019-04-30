package MyOwnPracticies;

import java.util.Scanner;

public class Assigment72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	   
	    word = word.substring(0,word.length()/2)+word.substring(0,word.length()/2);
	    System.out.println(word);

	}

}
