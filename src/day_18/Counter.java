package day_18;

public class Counter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// 1,2,3,4,5,6,7,8
		int num = 1;
		
		while(num<=10) {
		System.out.print(num+", ");
		num++;
		Thread.sleep(455);
		}
		System.out.println("\nNumber of num after loop: "+num);
		
		int num2 = 11;
		while (num2 >=1) {
			System.out.print(num2+", ");
			num2--;
			Thread.sleep(455);
		}
		System.out.println("\nNumber of num after loop: "+num2);
	}

}
