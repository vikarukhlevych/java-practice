package day28;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FastFoodRestaurants {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//read all data and assign to Array
		
		String [] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		
		System.out.println("Data size "+data.length);
		
		
		
		
		//print first row
		System.out.println(data[0]);
		System.out.println(data[1]);
		//print last restaurant
		
		
		System.out.println(data[data.length-1]);
		
		//print  each Restaurant on separate Line
		int counter = 0;
		for(int i =0;i<data.length;i++) {
			System.out.println("#"+ counter + "==>"+data[i]);
			counter++;
		}
		System.out.println("======================");
		// print all restaurants information in state VA
		int count=0;
		for(int i =0;i<data.length;i++) {
			if(data[i].contains(",VA,")) {
				System.out.println(data[i]);
				count++;
				
			}
		}
		System.out.println("Total Count of the Restaurnts in VA: "+count);
		
		// print rhe restaurants name along with city name
		//Subway-Herndon
		
		
		
		for(String res :data) {
			if(res.contains(",VA,")) {
				String [] resArr = res.split(",");
				System.out.println(resArr[2]+" - "+resArr[1]);
			}
		}
			
		}
		
		
		

	}


