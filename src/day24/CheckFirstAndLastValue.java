package day24;

public class CheckFirstAndLastValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//write a programm that will print true
		//if first and last number is the same
		//if first and last value in the array of ints
		//is the same print true
		
		
		int numbers [] = {12,41,213,21,42,12};
		if(numbers[0]==numbers[numbers.length-1]) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
