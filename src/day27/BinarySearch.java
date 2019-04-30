package day27;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] nums= {4,6,7,10,55};
		
		System.out.println(Arrays.binarySearch(nums, 10)); //3
		
		System.out.println(Arrays.binarySearch(nums, 2));
		System.out.println(Arrays.binarySearch(nums, 5));
		
		int  i =Arrays.binarySearch(nums, 10);
		
		System.out.println(i);
		
		int []nums2 = {40,6,17,10,55}; //6 10 17 40 55 
		//Arrays.sort(nums2);
		
		System.out.println(Arrays.binarySearch(nums2, 17));
		
		
		
		
		
		
		
	}

}
