package day_21;

public class ConvertCharToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		char ch = 'a';
		String str1 = ""+ ch; //First Way how to convert char into String
		
		
		
		char ch2 = 'v';
		String str2 = new String(""+ch2);
		
		String str3 = Character.toString(ch2);
		System.out.println(str2);
		System.out.println(str3);
		

	}

}
