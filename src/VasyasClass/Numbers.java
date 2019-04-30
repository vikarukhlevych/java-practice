package VasyasClass;

import java.util.Arrays;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] nums = {123,54,76,985, -645,543 };
		// get 2 element from array
		System.out.println(nums[1]);
		nums[1]=5;
		System.out.println(Arrays.toString(nums));
		
		int max = nums[0];
		for (int num: nums) {
			if(num>max) {
				max = num;
				
			}
		}
		System.out.println("Maximum: "+max);
		
		
		
		
		
		
		
		

	}

}
