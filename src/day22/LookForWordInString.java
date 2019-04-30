package day22;

public class LookForWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String sentence = "He said hi, then she replied hi. hi guys!";
		//print letters in pairs
		
		//
		int count =0;
	for(int i =0;i<sentence.length()-1;i++) {
		String temp = sentence.substring(i,i+2);
		System.out.println(temp);
		if(temp.equals("hi")){
			count+=1;
			System.out.println(count);
	}
	System.out.println(count);
	}
		
	}

}
