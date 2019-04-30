package day_30;

import java.util.Random;
import java.util.Scanner;

public class showMe5Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		showMe5Numbers();
		do10PushUps();
		rangePrint();
		

	}

	
	
	public static void showMe5Numbers() {
		
		Random r = new Random();
		for(int i =1;i<=5;i++) {
			System.out.print(r.nextInt(1001)+" "); // print random num 0-1000
		}
		System.out.println();
	}
	
	
	public static void do10PushUps() {
		
		for(int i=1;i<=10;i++) {
			System.out.println("Pushup "+ i);
		}
		
		
		System.out.println("Time to rest");
		
	}
	
	
	public static void rangePrint() {
	
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("Enter two whole numbers");
		int a = scan.nextInt();
		int b=scan.nextInt();
		
		if(a<b) {
			for(int i=a;i<=b;i++) {
				System.out.println(i+" ");
			}
			}else if(a>b) {
				for(int i=a;i>=b;i--) {
					System.out.println(i+" ");
				}
			} else if(a==b){
				System.out.println(a);
			}
	}
		
	
	
	
	
	
	




		}
		
		
		
		
		