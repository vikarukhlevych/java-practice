package MyOwnPracticies;
import java.util.*;
public class Assegment113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO: write your code below
		    
		    Arrays.sort(nums);
		    for(int i=0;i<nums.length;i++){
		      if(nums[i]==nums[i+1]){
		        System.out.println(nums[i]);
		        return;
		      } 
		    	  
		    	  
		      }
		    System.out.println(nums[6]);
		    }
		    
		
		
	
		    

}
