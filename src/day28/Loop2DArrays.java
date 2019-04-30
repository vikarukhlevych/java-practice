package day28;

import java.util.Arrays;

public class Loop2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		String [][]pizzas = {  
				{"pineapple","pepperoni"}, //0
				{"anchovies","m,ushrooms","olives"},//1
				{"4 cheese"},//2
				{"chicken","tomatoes","japalenios","onions"},//3
				{"green peppers","zuccini","brocolli","spinach","shripm"}//4
				};
		
		
		
		//System.out.println(Arrays.toString(pizzas[0]));
		
		
		
		for( String [] pizza:pizzas) {
			System.out.print(pizza.length+" toppings-");
			System.out.println(Arrays.toString(pizza));
	
		}
		
		
		System.out.println("##### FOR LOOP #####");
		for (int i=0;i<pizzas.length;i++) {
			System.out.print(pizzas[i].length+" toppings-");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		for(String topping: pizzas[2]){
			System.out.println(topping);
		}
		
		
		int [][] students = { {4,5,6}, {12,5,7}, {23,55,12,55,3} };
		
		//2 parts: outer loop and inner loop
		//outer loop will take each group
		//inner loop will take each value /student Id
		
		for( int[] group:students) {
			for(int studentId:group) {
				System.out.print(studentId+", ");
				
			}
		}
		
		System.out.println();
		
		
		int [][]nums = {
						{10,20},
						{20,30,40,50},
						{100,200,400},
						{555,333,111,444,666,78}
		};
		
		
		
		for(int i =0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.println(nums[i][j]);
			}
		}
		
		
		
		
		
		
		
		
		
		

	}

}
