package day20_forloop;

public class EverOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//usingg for loop[ 1-100
		//1.print all even numbers in same line
		
		for (int i = 1;i<=100;i++) {
			if (i%2==0) {
			System.out.println(i+" ");
		}
		}
		System.out.println("----------------------------------");
		//2.print all odd numbers in same line568iughjkv
		for (int i1 = 0; i1<=100; i1++) {
			if (i1%2!=0)
			System.out.println(i1+" ");
		}
		
		//SumOfOdds
		int sumOfOdds = 0;
		int sumOfEvens = 0;
		
		for (int num=1;num<=100;num++) {
			if(num%2 ==0) {
			sumOfEvens+=num;	
			} else if (num%2 !=0) {
				sumOfOdds +=num;
			}
		}
		System.out.println("SumOfEvens: "+ sumOfEvens);
		System.out.println("SumOfOdds: "+ sumOfOdds);
		
		
	}

}
