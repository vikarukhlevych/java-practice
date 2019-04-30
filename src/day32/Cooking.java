package day32;

public class Cooking {

	public static void main(String[] args) {
		
		add("eggs,milk,salt,pepper");
		//mix(20);
		//fry(120);
		//boil(500);
		makePancakes();
		makePasta();
		cook("Omelette","Eggs,salt,tomatoes,milk,pepper");
		
		
	}
	public static void cook(String dish,String ingredients) {
		System.out.println("##"+dish.toUpperCase()+" RECIPE##");
		add(ingredients);
		System.out.println("Cook it until it is cooked");
		System.out.println("##"+ dish.toUpperCase()+" IS READSY!##");
		
		
	}
	
	public static void makePancakes() {
		System.out.println("## Pancakes Recipe ##");
		add("milk, eggs, sugar, flout, salt, ");
		mix(120);
		fry(3);
		System.out.println("Enjoy your delicious Pancakes");
	}
	
	
	public static void makePasta() {
		System.out.println("Italian Pasta");
		add("Water, salt, olive oil, ");
		boil(2);
		add("Spagetti Pasta");
		boil(9);
		mix(60);
		System.out.println("Enjoy your pasta");
		
		
	}
	
	public static void add(String str) {

		System.out.println("Add "+str+" together");
		
}
public  static void mix(int seconds) {
	System.out.println("Mix for "+seconds+" seconds");
}

public static void fry(int seconds) {
	System.out.println("Fry for "+seconds+" seconds");
}

public static void boil(int minutes) {
	System.out.println("Boil for "+ minutes+" minutes");
}



}