package day07;

public class EnoughPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//slices in pizza -->8
		//slices per student --> 2
		
		int pizzaCount = 30;
		int studentsCount = 145;
		int totalSlices = pizzaCount*8;
		
		
		boolean isEnoughPizza = (totalSlices/studentsCount)>=2;
		System.out.println("Is Enought Pizza? "+ isEnoughPizza);
		
		

	}

}
