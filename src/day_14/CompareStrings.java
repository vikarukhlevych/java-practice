package day_14;
import java.util.*;

public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
String word1,word2;
System.out.println("Enter first word");
word1 = scan.next();
System.out.println("Enter second word");
word2 = scan.next();


if (word1.length() > word2.length()) {
	System.out.println("Word 1 is longer");
} else if (word2.length() > word1.length()) {
	System.out.println("Word 2 is longer");
} else {
	System.out.println("Word 1 and word2 are same length");
}






	}

}
