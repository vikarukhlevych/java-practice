package day_12;
import java.util.*;
public class SwithcStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
String weather;
System.out.println("What is the weather today?");
weather = scan.next(); //weather = scan.next().toLowerCase(); make everything that you type as lower case.
						// even though you type Upper Case
switch(weather) {
case "sunny":
	System.out.println("Go to Park\"\n" + 
			"                \"Code Java\"");
	break;
case "hot":
	System.out.println("Go Swimming\"\n" + 
			"                \"Code Java\"");
	break;
case "rainy":
System.out.println("Go shopping\"\n" + 
		"                \"Code Java");
break;
case "snowing":
	System.out.println("Chain your tyres\"\n" + 
			"\"Go skiing\"\n" + 
			" \"Code Java");
	break;
	default:
		System.out.println("Not such a weather!");
	
}

	}

}
