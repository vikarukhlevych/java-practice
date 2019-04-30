package day_21;

public class task2 {
public static void main(String[] args) {
	
	
	String word ="javva";
	
	String unique = "";
	char ch=word.charAt(0);
		System.out.println(unique.contains(""+ch));
			if (!unique.contains(""+ch)) {
				unique+=ch;
			}
			System.out.println("unique:"+unique);
			
			
			String word2 = "bananas";
			
			String unique2 ="";
			int i = 0;
			
			
			char ch2 = word2.charAt(i);
			System.out.println(ch2);
			i=1;
			ch2=word2.charAt(i);
			System.out.println("ch2: "+ch2);
			
			if(unique2.contains(""+ch2)) {
				
			}
		}
	}
	

