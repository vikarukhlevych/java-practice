package day27;
import java.util.*;

public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[]nums= {43,12,4,1,3,5};
		
		//toString method
		
		
		String str = Arrays.toString(nums);
		System.out.println(str);
		
		//Sort method-sorts Array in acsending order
		
		
		
			Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String[]languages = {"Zulu","Spanish","Italian","English","Polish","Arabic","Uzbek"};
		
		
		System.out.println(Arrays.toString(languages));
		
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		int [] nums2 = {345,665,3333,11,3,66,4563738};
		
		//find lowest and largest values from num2 Array
		
		Arrays.sort(nums2);
		
		System.out.println("Lowest values " + nums2[0]);
		
		
		System.out.println("Largest values " + nums2[nums2.length-1]);
	}

}
