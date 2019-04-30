package day24;

import java.util.Arrays;

public class carShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1 create an array of of strings on store these cars inside that array
		
		
		String[] cars= { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
		String [] cars2=new String[8];
		
		
		for(String car: cars) {
			if(car.startsWith("M")) {
				System.out.println(car+", ");
			}
			
		}
			//print all cars that contains letter "r"
			
			//make  your search Case insensitive
			
		for (String car:cars) {
			if(car.toLowerCase().contains("r")) {
				System.out.println(car+",");
			}
		}
		//print car names that ends with "a"
		for(String car: cars) {
			if(car.toLowerCase().endsWith("a")) {
			
			System.out.print(car+", ");
			}
		}
		System.out.println();
		System.out.println("===============");
		//print all cars that has at least 6 letters
		for(String car: cars) {
			if(car.length()>=6) {
			
			System.out.println(car+", ");
			}
		}
		
		// Swap first and last value in the array
		String temp = cars [0];
		cars[0]=cars[cars.length-1];
		cars[cars.length-1]= temp;
		System.out.println(Arrays.toString(cars));
		System.out.println("Before sorting");
        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(cars));
        System.out.println("Position "+ Arrays.binarySearch(cars, "Ford"));
		
		
	}

}
