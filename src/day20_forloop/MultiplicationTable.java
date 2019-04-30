package day20_forloop;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter number:");
int num = scan.nextInt();

//check if its valid
//if its not return

if (num<1 || num>10) {
	System.out.println("ERROR: Invalid input");
	return;
} 


for (int i=1;i<=10;i++) {
	System.out.println(num+" x " + i+" = "+num*i);
}


	}

}
