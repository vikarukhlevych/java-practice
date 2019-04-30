package day27;
import java.util.*;

public class CopyOfNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] nums1= {34,56,23,1,55};

		int [] nums2 =Arrays.copyOf(nums1, nums1.length+2);
		System.out.println(Arrays.toString(nums2));
		int[] nums3 = Arrays.copyOfRange(nums1, 1, 3); //Print from Sertain Index to Sertain Index
		System.out.println(Arrays.toString(nums3));
		
		
		int [] brandNewArray = {34,23,54,23};
		System.out.println("Length before "+brandNewArray.length );
		
		brandNewArray =Arrays.copyOf(brandNewArray , brandNewArray.length+5 );
		System.out.println("Length after "+ brandNewArray.length );
		System.out.println(Arrays.toString(brandNewArray) );
	}

}
