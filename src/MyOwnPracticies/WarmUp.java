package MyOwnPracticies;

import java.util.Arrays;
import java.util.Random;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String []names = {"James","Mary",
				"John","Patricia",
				"Robert","Jennifer",
				"Michael","Linda",
				"William","Elizabeth",
				"David","Barbara",
				"Richard","Susan",
				"Joseph","Jessica",
				"Thomas","Sarah",
				"Charles","Margaret",
				"Christopher","Karen",
				"Daniel","Nancy",
				"Matthew","Lisa",
				"Anthony","Betty",
				"Donald","Dorothy",
				"Mark","Sandra",
				"Paul","Ashley",
				"Steven","Kimberly",
				"Andrew","Donna",
				"Kenneth","Emily",
				"George","Carol",
				"Joshua","Michelle",
				"Kevin","Amanda",
				"Brian","Melissa",
				"Edward","Deborah",
				"Ronald","Stephanie",
				"Timothy","Rebecca",
				"Jason","Laura",
				"Jeffrey","Helen",
				"Ryan","Sharon",
				"Jacob","Cynthia",
				"Gary","Kathleen",
				"Nicholas","Amy",
				"Eric","Shirley",
				"Stephen","Angela",
				"Jonathan","Anna",
				"Larry","Ruth",
				"Justin","Brenda",
				"Scott","Pamela",
				"Brandon","Nicole",
				"Frank","Katherine",
				"Benjamin","Samantha",
				"Gregory","Christine",
				"Raymond","Catherine",
				"Samuel","Virginia",
				"Patrick","Debra",
				"Alexander","Rachel",
				"Jack","Janet",
				"Dennis","Emma",
				"Jerry","Carolyn",
				"Tyler","Maria",
				"Aaron","Heather",
				"Henry","Diane",
				"Jose","Julie",
				"Douglas","Joyce",
				"Peter","Evelyn",
				"Adam","Joan",
				"Nathan","Victoria",
				"Zachary","Kelly",
				"Walter","Christina",
				"Kyle","Lauren",
				"Harold","Frances",
				"Carl","Martha",
				"Jeremy","Judith",
				"Gerald","Cheryl",
				"Keith","Megan",
				"Roger","Andrea",
				"Arthur","Olivia",
				"Terry","Ann",
				"Lawrence","Jean",
				"Sean","Alice",
				"Christian","Jacqueline",
				"Ethan","Hannah",
				"Austin","Doris",
				"Joe","Kathryn",
				"Albert","Gloria",
				"Jesse","Teresa",
				"Willie","Sara",
				"Billy","Janice",
				"Bryan","Marie",
				"Bruce","Julia",
				"Noah","Grace",
				"Jordan","Judy",
				"Dylan","Theresa",
				"Ralph","Madison",
				"Roy","Beverly",
				"Alan","Denise",
				"Wayne","Marilyn",
				"Eugene","Amber",
				"Juan","Danielle",
				"Gabriel","Rose",
				"Louis","Brittany",
				"Russell","Diana",
				"Randy","Abigail",
				"Vincent","Natalie",
				"Philip","Jane",
				"Logan","Lori",
				"Bobby","Alexis",
				"Harry","Tiffany",
				"Johnny","Kayla"};
		
		
		
		
		//print number of names on the array
		
		
		int length=names.length;
		System.out.println("Total names: "+length);
		
		
		//print all names in single line
		
		
		System.out.println(Arrays.toString(names));
		
		
		//print  in column format 
		//2 names inj each line
		System.out.println("================");
		for(int i=0;i<names.length-1;i++) {
			System.out.print(names[i]+", ");
			System.out.println(names[i+1]);
		}
		
		//print male names in one line
		
		System.out.println("MALES NAMES: ");
				for(int i=0;i<names.length-1;i+=2) {
			
			System.out.print(names[i]+", ");
			
		}
		
		//print females names
		
				System.out.println("\nFEMALE NAMES: ");
		for (int idx = 0;idx<=names.length-1;idx++) {
			if(idx%2!=0) {
				if(idx==names.length-1) {
					System.out.println(names[idx]);
				} else {
				System.out.print(names[idx]+", ");
				}
			}
			
		}
		
		//print random name from this array
		
		
		//use Random classs
		
		System.out.println("\nRandom NAME: ");
		Random name = new Random();
		
		int r = name.nextInt(names.length);
		
		System.out.println(names[r]);
		
		
		// Print all names that are uo to 4 characters in uppercase in same kine
		System.out.println("\nNAMES WITH 4 CHARAXTERS OR LESS");
		for (int i=0;i<=names.length-1;i++) {
			if(names[i].length()<=4) {
				System.out.print(names[i].toUpperCase()+", ");
			}
		
		}
		System.out.println("==================");
	String namesUpTo4="";
	String names5to6="";
	String names7orMore="";
	
	for (String naMe :names) {
		if(naMe.length()<=4) {
			namesUpTo4+=naMe+", ";
			
		}else if(naMe.length()>=5 && naMe.length()<=6) {
			names5to6+=naMe+", ";
	}else if(naMe.length()>=7) {
		names7orMore=naMe+", ";
	
	
	}
	}
	System.out.println("Names up to 4: "+namesUpTo4);
	System.out.println("Names 5 to 6: "+names5to6);
	System.out.println("Names 7 or  More: "+names7orMore);
	
	
	
	
	//Code  HERE
	
	
System.out.println("\nSwap names: ");
System.out.println(Arrays.toString(names));
String str1="first word";
String str2="second word";
//String temp=str1;
str1=str2;
//str2=temp;


	for(int i = 0;i<names.length-1;i+=2) {
		 String temp=names[i];
		names[i]=names[i+1];
		names[i+1]=temp;
	temp=names[i+1]+", "+names[i];
		//System.out.println(temp);
		
	}
	System.out.println(Arrays.toString(names));
	
	}

}
