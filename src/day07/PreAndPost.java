package day07;

public class PreAndPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 0; //1
		int num2 = num++; //0
		System.out.println("num: "+ num);
		System.out.println("num2: "+ num2);
		
		int n= 20;
		int n2 = n++;
		System.out.println("n: "+n);
		System.out.println("n2: "+n2);
		
		int bananas = 6;
		int pears = bananas ++;
		int apples = ++ bananas;
		 System.out.println("bananas: "+ bananas); // 8
		 System.out.println("pears: "+ pears); //6
		 System.out.println("apples: "+ apples); //8
		 
		 
		 int friends = 10;
		System.out.println(friends++);
		System.out.println(friends);
		 System.out.println(++friends);
		 
		 int p1= 10;
		 int sum = p1++ + 5;
		 System.out.println("sum: "+sum);
		 System.out.println("p1: "+p1);
		 
		 //p1+5 and assign to sum
		 //p = p+1
		 
		 
		 int batteries =8;
		 int oldBatteries = 5;
		 int totalBatteries = batteries++ + ++oldBatteries;
		 System.out.println("batteries:" + batteries); //9
		 System.out.println("oldBatteries: "+ oldBatteries);//6
		 System.out.println("totalBatteries: "+totalBatteries);
		 
		 int pens = 10;
		 pens++;
		 ++pens;
		 System.out.println("pens = "+ pens);
		 
		 int tables = 20;
		 int chairs = --tables;
		 int laptop = ++ chairs;
		 int bottles = tables --;
		 System.out.println(tables +" " + chairs +" "+laptop+" "+bottles);
		 
		 
		 
	}

}
