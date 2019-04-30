package day_13;

public class MoreTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String quality ="bad";
		int rating = (quality.equals("good")) ? 100 : 0;
		
		System.out.println("Rating: "+ rating);
		
		
		int PMhour = 1;
		
		// Rush hour during evening: 4-7pm
		boolean rushHour =  PMhour>=4 && PMhour<=7 ? true: false;
		//System.out.println("Rush Hour? " + rushHour);
		String result = (rushHour==true)? "yes": "no";
				System.out.println("Rush Hour? " + result);
				
			int AMHour = 8; // 6 - 9 Am- rushHour
			
			String amRushHour = AMHour>=6 && AMHour<=9 ? "yes": "no";
		System.out.println("Am Rush Hour? " + amRushHour);
			
				
				
				
	}

}
