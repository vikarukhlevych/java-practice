package day24;

import java.util.Arrays;

public class LoteryTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] loteryNumbers = {12,45,3,62,42,90};
		
		System.out.println(Arrays.toString(loteryNumbers));
		Arrays.sort(loteryNumbers);
		System.out.println(Arrays.toString(loteryNumbers));
		
		
		//binary search works only with sorted array
		int index= Arrays.binarySearch(loteryNumbers, 9);
		
		System.out.println("Position "+index);
		
	}

}
