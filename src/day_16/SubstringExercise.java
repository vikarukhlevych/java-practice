package day_16;

public class SubstringExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get number from string in [ ...]
		String sentence = "I wrote [2348905] lines of code today";
		int start = sentence.indexOf('[')+1;
		int end= sentence.indexOf(']');
		String num = sentence.substring(start, end);
		System.out.println("Lines of code: "+num);
		
		//this is nesting  way of printing.
		System.out.println("Lines of code is: "+sentence.substring(sentence.indexOf('[')+1,sentence.indexOf(']')));
		
		
		//check if num is more than 10
		
		int count = Integer.parseInt(num); // This is how we convert String to Integer
		if (count>20) {
			System.out.println("Wrote more than 20 lines of code today");
		} else {
			System.out.println("Not enough coding for today");
		}
		
		
	}

}
