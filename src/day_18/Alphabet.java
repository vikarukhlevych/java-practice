package day_18;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char letter = 'a';
		 
		while (letter<='z') {
			System.out.print(letter +" ");
			letter++;
		}
		System.out.println("");
		char capitals = 'A';
		while (capitals <='Z') {
			System.out.print(capitals +" ");
			capitals++;
		}

		System.out.println(" ");
		char letter1 = 'z';
		while(letter1 >='a') {
			System.out.print(letter1 +" ");
			letter1--;
		}
		System.out.println(" ");
		String letters ="";
		char myletter='A';
		
		while(myletter<='Z') {
			letters = letters+myletter;
			System.out.println(letters);
			myletter++;
		}
		
		
	}

}
