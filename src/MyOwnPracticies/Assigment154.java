package MyOwnPracticies;

import java.util.Scanner;

public class Assigment154 {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    isPalindrome(num);
	  }
	  
	  public static void isPalindrome(int num){
	    //WRITE YOUR CODE HERE
	    
	   
	    int palindrome = num;
	    int reverse = 0;
	    
	    
	    while(palindrome!=0){
	      int remainder = palindrome%10;
	      
	      reverse = reverse*10+remainder;
	      palindrome = palindrome/10;
	      
	    }
	    if(num == reverse){
	      System.out.println("true");
	    } else{
	      System.out.println("false");
	    }
	  }
	}


