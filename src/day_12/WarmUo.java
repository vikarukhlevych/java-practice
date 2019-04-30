package day_12;
import java.util.Scanner;


public class WarmUo {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
//	int n1 = 1000;
//	int n2 = 1000;
//	int n3 = 100;
	
//	if(n1 >= n2 && n1 >= n3) {
//		System.out.println("n1 is bigger");
//	}else if(n2 >= n1 && n2 >= n3) {
//		System.out.println("n2 is bigger");
//	}else {
//		System.out.println("n3 is bigger");
//	}
	int n1 = 1000;
	int n2 = 1000;
	int n3 = 100;
	
	if(n1 > n2 && n1 > n3 ) {
		System.out.println("n1 is bigger");
	}else if(n2 > n3 ) {
		System.out.println("n2 is bigger");
	}else {
		System.out.println("n3 is bigger");
	}
	
	
}
}
