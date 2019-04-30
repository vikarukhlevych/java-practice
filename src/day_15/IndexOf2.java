package day_15;

public class IndexOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//index of with 2 inputs
		
		
		
		
		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list.indexOf("-");
		System.out.println("First Dash: "+ firstDash);
		
		int secondDash = list.indexOf("-" , 5);
		
			System.out.println("Second Dash: "+secondDash);
			int thirdDash = list.indexOf("-" , secondDash+1);
			System.out.println("Third Dash: "+ thirdDash);
			
			
			//find last Dash
			
			int lastDash = list.lastIndexOf("-");
			System.out.println("Last Dash: "+ lastDash);
			
	}

}
