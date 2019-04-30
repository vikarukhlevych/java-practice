package MyOwnPracticies;

import java.util.Scanner;

public class Assigment90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	    String html = scan.nextLine();
	  
	    if (!html.contains("<html>")){
	      System.out.println("Invalid input!");
	    } else{
	      html.substring(html.indexOf("=")+1,html.indexOf(">")-1);
	    }
	  System.out.println(html);
	}

}
