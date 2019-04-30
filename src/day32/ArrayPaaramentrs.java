package day32;

import java.util.Arrays;

public class ArrayPaaramentrs {

	public static void main(String[] args) {
		int [] myArray = {44,22,66,11};
		
		printArray(myArray);
		printArray(new int [] {33,45,5,7});
		int [] myNums= new int [] {3,4,5,6,7,8,9,10};
		printArray(myNums);
		
		
		int [] one= {10,2,3};
		int [] two = {3,1,4,323,100};
		print2Arrays(one,two);
		print2ArraysV2(one,two);
	}
	
	/*/
	 * Method: printArray
	 * return type: void
	 * param: int[] nums
	 * print vsalues of the nums Array
	 * 
	 * 
	 */
	
	
	
	public static void printArray(int [] nums) { // so int[] nums = int [] myArary
		for(int n:nums) {
			System.out.print(n+" ");
		}
		
		System.out.println();
	}
	
	/*/
	 * Method name: print2Arrays
	 * return: void
	 * params: 2 int []
	 * 
	 *it prints the larger Array followed by smaller Array
	 */
	
	
	public static void print2Arrays(int [] Array1,int[] Array2) {
		if(Array1.length>Array2.length) {
			System.out.println("Larger: "+Arrays.toString(Array1));
			System.out.println(Arrays.toString(Array2));
		} else if (Array1.length<Array2.length) {
			System.out.println("Larger: "+Arrays.toString(Array2)); {
			System.out.println(Arrays.toString(Array1));
		}
		}
		
	}
	
	//version2. we will call printArray Method in this Method
	public static void print2ArraysV2(int [] Array1,int[] Array2) {
		if(Array1.length>Array2.length) {
			printArray(Array1);
			printArray(Array2);
			
		} else if (Array1.length<Array2.length) {
			printArray(Array2);
			printArray(Array1);
		}
		}
	
}
