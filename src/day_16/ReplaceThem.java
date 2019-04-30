package day_16;

public class ReplaceThem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		
		String sentence = "Coding is fun, it is my hobby!!";
		
		String withNoSpaces = sentence.replace(" ", "");
		System.out.println(withNoSpaces);
		System.out.println(sentence);
		
		sentence = sentence.replace( "," , "!!!");
		
		System.out.println(sentence);
		

		String mixed = "&^@#$ja-v|a&%$";
		//mixed = mixed.replace("&^@#$ja-v|a&%$", "java");
		 mixed = mixed.replace("$", "").replace("-", "").replace("|", "");
		System.out.println(mixed);
		
		
		String result = "About 115,000,000 results (0.59 seconds)";
		
		
		// to find 115 0000000 we can using replace
		
		result = result.replace("About ", "");
		//result = result.replace(" results (0.11 seconds)", ""); might break when numbeer changes
		
		result = result.substring(0, result.indexOf(" "));
		result = result.replace(",", "");
		
		System.out.println(result);
		
		
		
		
		
		
	}

}
