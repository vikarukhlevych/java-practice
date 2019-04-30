package day24;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an array of integers length 3
		
		
		int[] numbers= new int [3];
		//first value in array
		numbers[0]=5;
		//this is second value in array
		numbers[1]=10;
		//this is the third value of array
		numbers[2]=20;
		//if you print this way you are not gonna get array,you will get some hasg code
		//System.out.println(numbers);
		
		//toString method prints values of Array
		System.out.println(Arrays.toString(numbers));
		//System.out.println(Arrays.toString(numbers).substring(1,Arrays.toString(numbers).length()-1));
		int sum=0;
		
		//use for loop in order to loop thru the array and calculate
		//sum of all elements
		
		for (int i=0;i<numbers.length;i++) {
			sum=sum+numbers[i];
		}
		System.out.println("Sum: "+sum);
		//find biggest value in the array
		
		//int max=0; 
		int max=Integer.MIN_VALUE;
		for (int i=0;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max = numbers[i];
				
			}
		}
		System.out.println("Max value: "+max);
		
		//Find Min Value in the Array
		
		int min=Integer.MAX_VALUE;
		
		for (int k=0;k<numbers.length;k++) {
			if(numbers[k]<min) {
				min = numbers[k];
				
			}
		}
		System.out.println("Max value: "+min);
		
		
		

	}

}
