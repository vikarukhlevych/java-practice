package MentoringSessions;

import java.util.Arrays;

public class MentoringApril30 {
//  Write a Java program to remove a specific element from an array.
    public static void main(String[] args) {
        int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
        removeNumberFromArray(my_array, 56);
    }
    public static int[] removeNumberFromArray(int[] arr, int numberToDelete) {
        System.out.println("Original Array : " + Arrays.toString(arr));
        int counter = 0;
        //count how many numbers in the array
        for(int i: arr) {
            if(i==numberToDelete) {
                counter++;
            }
        }
        //create a new array 
        int[] newArr = new int[arr.length-counter];
        //add values to the new array except target number 
        for(int i =0, j=0; i < arr.length; i++, j++) {
            if(arr[i]==numberToDelete) {
                --j;
                continue;
            }
            newArr[j]=arr[i];
        }
        // last element in the array will exist twice
        System.out.println("After removing the second element: " + Arrays.toString(newArr));
        return arr;
    }
}
	
	


