package day35;
import java.util.*;
public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//in main method
		

		int [] nums = {7,4,1,4,1,5,9,9,3};
		findUnique(nums);
		int[] arr = {2,3,4,5,6,7,2,3,4,5};
		findUnique(arr);
		int [] unique = getUniqueArray(arr);
		System.out.println(Arrays.toString(unique));
		int [] cheapUniques =getUniqueArrayCheapV2(arr);
		System.out.println(Arrays.toString(cheapUniques));
		
		
		for(int i=0;i<nums.length;i++) {
			int temp=nums[i];
			int counter=0;
			for(int j=0;j<nums.length;j++) {
				if(i!=j && temp==nums[j]) {
					counter++;
					break;
				}
			}
			if(counter==0) {
				System.out.println(temp);
			}
		}	
		
	}

	
public static void findUnique(int[]nums) {
	
	for(int i=0;i<nums.length;i++) {
		int temp=nums[i];
		int counter=0;
		for(int j=0;j<nums.length;j++) {
			if(i!=j && temp==nums[j]) {
				counter++;
				break;
			}
		}
		if(counter==0) {
			System.out.println(temp);
		}
	}	
}
	//declare empty String
	//find unique numbers and add to that String
	//split that String by " "
//declare new int [] array and assign each number from split
//return int[] array

public static int[] getUniqueArrayCheapV2(int [] nums) {
	
	String unique="";
	for(int i=0;i<nums.length;i++) {
		int temp=nums[i];
		int counter=0;
		for(int j=0;j<nums.length;j++) {
			if(i!=j && temp==nums[j]) {
				counter++;
				break;
			}
		}
		if(counter==0) {
			unique+=temp+" ";
		}
	}	
	//split the String by space
	
	String[] strArr = unique.trim().split(" ");
	int [] uniqueArray = new int [strArr.length];
	
	
	for (int k=0;k<strArr.length;k++) {
		uniqueArray[k]=Integer.parseInt(strArr[k]);
	}
	//return uniqueArray
	
	return  uniqueArray;
}
	
	//find out how many unique numbers 
	//declare new array with that size
	//and loop thru again and assign unique numbers 
	//then return the array
	
	public static int[] getUniqueArray(int[]nums) {
		
		//find out how many unique numbers 
		int uniqueCount =0;
		for(int i=0;i<nums.length;i++) {
			int temp=nums[i];
			int counter=0;
			for(int j=0;j<nums.length;j++) {
				if(i!=j && temp==nums[j]) {
					counter++;
					break;
				}
			}
			if(counter==0) {
				uniqueCount++;
			}
		}	
		
		//declare new array with that size
		
		int[] uniqueArray = new int[uniqueCount];
		int idx =0;
		//and loop thru again and assign unique numbers 
		
		
		for(int i=0;i<nums.length;i++) {
			int temp=nums[i];
			int counter=0;
			for(int j=0;j<nums.length;j++) {
				if(i!=j && temp==nums[j]) {
					counter++;
					break;
				}
			}
			if(counter==0) {
				uniqueArray[idx]=temp;
				idx++;
			}
		}	
		
		//return array
		return uniqueArray;
	
	
	
}
	

}
