package day34;

import java.util.Arrays;

public class VarArgs {
	public static void main(String[] args) {
		
		printWords("red","blue");
		System.out.println(sum(20,40,56,78,100));
		
		
		int budget=200;
		if(sum(10,45,110,30)<=budget) {
			System.out.println("Within budget");
		}else {
			System.out.println("Broke");
		}
		
		
		int total = sum(234,43,567,12,34,5);System.out.println("total: "+total);
		
		
		cook("Buritto bowl","chicken","beans","meat","sour cream");
		cook("Avocado toast","Avocado","Sunny side eggs","Wheat bread");
		shoppingList(120,"potato","cucumber","tomato","sour cream");
		
		String [] myPets = {"cat","horse","dog","sheep","goat"};
		printWords(myPets);
	}

	
	public static void printWords(String...words) {
		//handle it like an ARRAY
		
		for(String w: words)
		System.out.println(w);
	}
	
	public static int sum(int...nums) {
		int sum =0;
		for(int num:nums) {
			sum +=num;
			//System.out.println(sum);
		}
		
		return sum;
	}
	
	public static void cook(String name,String ...ings) {
		System.out.print("Food: "+name);
		System.out.println(Arrays.toString(ings));
		
	}
	
	public static void shoppingList(int totalPrice,String...items) {
		
		System.out.println("Total cost: "+totalPrice);
		System.out.println(Arrays.toString(items));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
