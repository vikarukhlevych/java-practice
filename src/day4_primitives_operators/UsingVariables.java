package day4_primitives_operators;

public class UsingVariables {
	
public static void main(String[] args) {
	//declare num1, num2, num3
	
	int num1, num2, num3;
	
	num1 = 100;
	num2 = num1;
	System.out.println(num1);
	System.out.println(num2);
	
	
	num2 = 200;
	num1 = num2;
	num3 = num1;
	
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
	
	//declare apples and assign 25
	//declare kiwis and aggign value of apples to it
	//declare mangos and assign 55
	//assign mangos to kiwis
	
	int apples = 25;
	int kiwis = apples;
	int mangos = 55;
	kiwis = mangos;
	System.out.println(apples); // 25
	System.out.println(kiwis); // 55
	System.out.println(mangos); //55
	
	int strawberries = 45;
	int bananas = strawberries;
	int cherries = strawberries+bananas;
	
	System.out.println(strawberries + bananas + cherries);
	
	
	
	
}
}
