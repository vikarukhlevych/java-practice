package day34;

import java.util.Random;

public class CountArray {
	
	
	public static void main(String[] args) {
		
		System.out.println(findOccurences(new int [] {3,15,6,7,8,6,6},6));
		
		
	}
	
	
	public static int findOccurences(int [] array,int value){
		
		int count =0;
		for(int i =0;i<array.length;i++) {
			if(array[i]==value) {
				count++;
			}
		}
		return count;
	}
	
	
	public static int [] getArray() {
		
		int [] arr = {45,76,22,34,1};
		
		return arr;
	}
	
	
public static int [] getRandomArray(int size) {
		
		Random rand = new Random(); // create Random class object
		
		int [] array = new int[size]; 
		
		for(int i =0;i<size;i++) {
			array[i]=rand.nextInt(101); //get random number and assign to array index
		}
		
		return array;
	
	
	
	
	
	
}
	
	
	
	
}
