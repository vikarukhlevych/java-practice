package day24;

public class ArrayOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] values = {'a','b','c'};
		for(char value: values) {
			System.out.println(value);
		}
	
	
	String str = "Wooden Spoon";
	//this, method toCahrArray() converts string into 
	//array of characters
	
	char [] chars = str.toCharArray();
	for (char c: chars) {
		System.out.print(c+"_");
	}
	System.out.println();
	str="";
	
for (int i = chars.length-1;i>=0;i--) {
str+=chars[i];
	System.out.print(str);
}
// Print characters with help of array characters one by one
//if chararcter is equals to "o" replace it with *


for (char c: chars) {
	if(c=='o') {
		System.out.println("*");
	} else {
		System.out.println(c);
	}
}




	
}

}