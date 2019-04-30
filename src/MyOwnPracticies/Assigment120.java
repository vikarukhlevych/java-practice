package MyOwnPracticies;

import java.util.Scanner;

public class Assigment120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	    String[] str = {scan.next(), scan.next(), scan.next(), 
	                    scan.next(), scan.next(), scan.next()};

	
	    int index=100;
		for(int i=0;i<str.length;i++){
		  if(str[i].length()<index){
			  index=i;
  }
}
	System.out.println(str[index]);
 
	}

}
