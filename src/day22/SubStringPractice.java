package day22;

public class SubStringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word ="java";
		
		System.out.println(word.substring(0,2));
		
		//print each character in separate line using
		//substring
		
		
		System.out.println(word.substring(0,1));
		System.out.println(word.substring(1,2));
		
		System.out.println(word.substring(2,3));
		
		System.out.println(word.substring(3,4));
		System.out.println(word.substring(4));
		System.out.println("=================");
		int i =0;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		System.out.println("====================");
		for(int n =0;n<=3;n++) {
			System.out.println(word.substring(n,n+1));
		}
		
		System.out.println("#########REVERE###########");
		
		for (int n1=3;n1>=0;n1--) {
			System.out.println(word.substring(n1,n1+1));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
