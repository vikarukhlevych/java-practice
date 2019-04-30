package VasyasClass;

import java.util.Arrays;

public class Numbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] nums = {{ 123, 532, 34, 643, -345, 73, 436, 344362, 547 },
				{ 12123, 657, 34, 56643, -567, 73, 345, 4563657, 35673576 },
				{ 22342, 343, 3453245, 34534, -567, 73, 345, 4563657,  }
					};
		
		
		int maximum = nums[0][0];
		
		int minimum = nums[0][0];
		
		
		//outer  loop that is changing rows!!!!!!
		for(int rows =0;rows<nums.length;rows++) {
		//System.out.println(Arrays.toString(nums[rows]));
			
			//inner loop that is changing Columns!!!!!
			
			for(int columns =0;columns<nums[rows].length;columns++) {
				if(nums[rows][columns]>maximum) {
					maximum=nums[rows][columns];
				}
				if(nums[rows][columns]<minimum) {
					minimum=nums[rows][columns];
				}
				System.out.print(nums[rows][columns]+" ");
			}
			System.out.println();
		}
		System.out.println("Minimum: "+minimum);
		System.out.println("Maximum: "+maximum);
		}

	}


