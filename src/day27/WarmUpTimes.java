package day27;

public class WarmUpTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//declare 2 int arrays time1 and time2
		//both of them have 2 items/values that represent hour and minute
		//hours 1-24
		//minutes 0-59
		
		
		
		
		int[] time1= {10,25};  //int [] time1=new int[2]
		int [] time2= {35,15}; // int [] tuime2 = new int[2]
		
		//we need to check if hours and minutes are valid
		if(time1[0]<0 || time1[0]>23) {
			System.out.println("Time1 has invalid hour");
			return; //stop  code break we use just with Array and Switch statement.
		}
			if(time1[1]<0||time1[1]>59) {
				System.out.println("Time1 has invalid minutes");
				return;
		}
			if(time2[0]<0||time2[0]>23) {
				System.out.println("Time2 has invalid hour");
				return;
			}
				if(time2[1]<0||time2[1]>59) {
					System.out.println("Time2 has invalid minutes");
					return;
			}
		if(time1[0]<time2[0]) {
			 System.out.println("time1 is earlier");
		 } else if(time1[0]>time2[0]) {
			 System.out.println("time2 is earlier");
		 } else {
			 if(time1[1] < time2[1]) {
					System.out.println("Time1 is earlier");
				}else if(time2[1] < time1[1]) {
					System.out.println("Time2 is earlier");
				}else {
					System.out.println("Same Time!");
				}
			}
		
		
	}

}
