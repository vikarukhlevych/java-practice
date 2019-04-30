package day34;
import java.util.*;
public class MainArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.toString(CountArray.getArray()));
		
		int [] nums = CountArray.getArray();

		System.out.println(Arrays.toString(nums));
		
		//for(;;) {   /// this is infinite loop while TRUE
		System.out.println(Arrays.toString(CountArray.getRandomArray(6)));
		//}
		
		
		int [] randomNums=CountArray.getRandomArray(3);
		System.out.println(Arrays.toString(randomNums));
	}

	
	}
	
	
	
	
	


