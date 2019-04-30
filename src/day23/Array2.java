package day23;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an array of String ,with size 5
		
		
		String [] names = new String[5];
		//size = to number of items
String [] names2= {"Bill", "Roman", "Vlad", "Burak", "Maria"};


System.out.println(names2[0]);
System.out.println("Number of item: "+names2.length);

String[] countries = {};
countries[0]="USA";
// Array has Fixed Size


String[] fruits = new String [] {"apple","orange"};
// for each loop stand for collections of data
//we need to specify data type,variable name: our collection of data
for (String fruit: fruits) {
	System.out.println(fruit);
}

	}

}
