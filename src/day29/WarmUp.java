package day29;

import java.util.Arrays;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][]countriesArray= {
									{"USA","Washington DC"},
									{"Canada","Ottava"},
									{"Mexico","Mexico city"},
									{"Brasil","Brasilia"},
									{"Peru","Lima"},
									{"Argentina","Buenos Aeros"},
									{"Bolivia","La Paz"},
									{"MAcedonia","Scople"},
									{"Kazahstan","Nursultan"}
									
		};
		
		
		
		//print usa with capital city
		
		System.out.println(countriesArray[0][0]+"|"+countriesArray[0][1]);
		
		System.out.println(countriesArray[8][0]+"|"+countriesArray[8][1]);
		
		
		System.out.println(Arrays.deepToString(countriesArray));
		
		
		//print all the countries in the same line separated |
		
			//use loop
		for(int i =0;i<countriesArray.length;i++) {
			System.out.println(countriesArray[i][0]+"|");
			
			}
		System.out.println();
		//use for each loop
		
		for(String []country:countriesArray) {
			System.out.print(country[0]+"|");
		}
			
		//get all the Cities and add to cities Array
			
			
			System.out.println();
			System.out.println("===============");
			
			String[] cities = new String [countriesArray.length];
			//null means no object.it is not the same as empty string
			
			System.out.println(Arrays.toString(cities));
			
			for(int i =0;i<countriesArray.length;i++) {
				cities[i]=countriesArray[i][1];
				
				
			}
			
			System.out.println(Arrays.toString(cities));
			
		//look for Bolivia in the countries array and 
		
			for(int i =0;i<countriesArray.length;i++) {
				if(countriesArray[i][0].equals("Bolivia")) {
					//System.out.println(countriesArray[i][1]);
					if (countriesArray[i][1].equals("La Paz")) {
						System.out.println("Bolivia test passed");
					} else {
						System.out.println("Bolivia test failed");
					}
					break; //exit the loop!!!
					}
				}
			
	
		
		
		
		
		
		

		
		

	}

}
