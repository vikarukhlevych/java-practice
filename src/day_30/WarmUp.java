package day_30;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print5Stars();
		//print(print5Stars) or call the method 100 times
		
		for(int i =0;i<100;i++) {
			print5Stars();
		}
			introduce();
		
		
		
	}

	
	
	public static void print5Stars(){
		
		System.out.println("*****");
	
	}
	
	
	public static void introduce() {
		
		
		Scanner scan= new Scanner(System.in);
		String name="";
		System.out.println("Whats your name?");
		name=scan.next();
		System.out.println("Nice to meet you, " +name );
		
	}
	
	
	
	
	
}
